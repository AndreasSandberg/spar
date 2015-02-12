package se.sandberg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import se.sparavisering.AdressTYPE;
import se.sparavisering.AviseringsPostTYPE;
import se.sparavisering.FolkbokforingsadressTYPE;
import se.sparavisering.PersondetaljerTYPE;
import se.sparavisering.SarskildPostadressTYPE;
import se.sparavisering.UtlandsadressTYPE;

public class ParseSpar {

	public static void main(String[] args) throws JAXBException, IOException {
		if(args.length != 1){
			System.out.println("Usage: ParseSpar path-to-indata-file");
			System.exit(-1);
		}
		File inputFile = new File(args[0]);
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(inputFile.getAbsolutePath()+".csv")));
		JAXBContext jaxbContext = JAXBContext.newInstance(se.sparavisering.SPARAvisering.class);
 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		se.sparavisering.SPARAvisering avisering = (se.sparavisering.SPARAvisering) jaxbUnmarshaller.unmarshal(inputFile);
		List<AviseringsPostTYPE> aviseringsPoster = avisering.getAviseringsPoster().getAviseringsPost();
		for(AviseringsPostTYPE aviseringsPost : aviseringsPoster){
			PersondetaljerTYPE persondetaljerTYPE = aviseringsPost.getPersondetaljer().get(0);
			writer.write(notNull(persondetaljerTYPE.getFornamn()) + ";");
			writer.write(notNull(persondetaljerTYPE.getEfternamn())+ ";");

			AdressTYPE adressTYPE = aviseringsPost.getAdress().get(0);
			FolkbokforingsadressTYPE folkbokforingsadress = adressTYPE.getFolkbokforingsadress();
			SarskildPostadressTYPE sarskildPostadress = adressTYPE.getSarskildPostadress();
			UtlandsadressTYPE utlandsadress = adressTYPE.getUtlandsadress();
			if(folkbokforingsadress != null && (folkbokforingsadress.getUtdelningsadress1() != null || folkbokforingsadress.getUtdelningsadress2() != null)){
				writer.write(notNull(folkbokforingsadress.getUtdelningsadress1())+ " ");
				writer.write(notNull(folkbokforingsadress.getUtdelningsadress2())+ ";");
				writer.write(notNull(folkbokforingsadress.getPostNr())+ ";");
				writer.write(notNull(folkbokforingsadress.getPostort())+ ";");
			}else if(sarskildPostadress != null && (sarskildPostadress.getUtdelningsadress1() != null || sarskildPostadress.getUtdelningsadress2() != null)){
				writer.write(notNull(sarskildPostadress.getUtdelningsadress1())+ " ");
				writer.write(notNull(sarskildPostadress.getUtdelningsadress2())+ ";");
				writer.write(notNull(sarskildPostadress.getPostNr())+ ";");
				writer.write(notNull(sarskildPostadress.getPostort())+ ";");
			}else if(utlandsadress != null && (utlandsadress.getUtdelningsadress1() != null || utlandsadress.getUtdelningsadress2() != null)){
				writer.write(notNull(utlandsadress.getUtdelningsadress1())+ " ");
				writer.write(notNull(utlandsadress.getUtdelningsadress2())+ ";");
				writer.write(notNull(utlandsadress.getPostKodUtland())+ ";");
				writer.write(notNull(utlandsadress.getPostortUtland())+ ";");
			}
			writer.write("\n");
		}
		writer.flush();
		writer.close();
	}

	private static String notNull(String s) {
		return (s != null ? s : "");
	}

}
