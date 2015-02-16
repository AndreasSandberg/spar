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
import se.sparavisering.AvregistreringsorsakKodTYPE;
import se.sparavisering.FolkbokforingsadressTYPE;
import se.sparavisering.PersondetaljerTYPE;
import se.sparavisering.SarskildPostadressTYPE;
import se.sparavisering.UtlandsadressTYPE;

public class ParseSpar {

	public static void main(String[] args) throws JAXBException, IOException {
		if (args.length != 1) {
			System.out.println("Usage: ParseSpar path-to-indata-file");
			System.exit(-1);
		}
		File inputFile = new File(args[0]);
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
				inputFile.getAbsolutePath() + ".csv")));
		JAXBContext jaxbContext = JAXBContext
				.newInstance(se.sparavisering.SPARAvisering.class);
		writer.write("Personnummer;Avregistreringsorsak;Sekretessmarkering;Förnamn;Tilltalsnamn (index);Efternamn;Folkbokföringsadress1;Folkbokföringsadress2;Folkbokföringspostnummer;Folkbokföringspostort;SärskildPostadress1;SärskildPostadress2;SärskildPostnummer;SärskildPostort;Utlandsadress1;Utlandsadress2;Utlandsadress3;Utlandpostkod;Utlandpostort;Land\n");
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		se.sparavisering.SPARAvisering avisering = (se.sparavisering.SPARAvisering) jaxbUnmarshaller
				.unmarshal(inputFile);
		List<AviseringsPostTYPE> aviseringsPoster = avisering.getAviseringsPoster().getAviseringsPost();
		for (AviseringsPostTYPE aviseringsPost : aviseringsPoster) {
			writer.write(notNull(aviseringsPost.getPersonId().getFysiskPersonId()) + ";");
			if (aviseringsPost.getPersondetaljer().get(0).getAvregistreringsorsakKod() != null) {
				writer.write(aviseringsPost.getPersondetaljer().get(0).getAvregistreringsorsakKod() +";");
			} else {
				writer.write(";");
			}
			writer.write(notNull(aviseringsPost.getSekretessmarkering().name())
					+ ";");
			PersondetaljerTYPE persondetaljerTYPE = aviseringsPost
					.getPersondetaljer().get(0);
			writer.write(notNull(persondetaljerTYPE.getFornamn()) + ";");
			writer.write(String.valueOf(persondetaljerTYPE.getTilltalsnamn())+ ";");
			writer.write(notNull(persondetaljerTYPE.getEfternamn()) + ";");

			AdressTYPE adressTYPE = aviseringsPost.getAdress().get(0);
			FolkbokforingsadressTYPE folkbokforingsadress = adressTYPE.getFolkbokforingsadress();
			SarskildPostadressTYPE sarskildPostadress = adressTYPE.getSarskildPostadress();
			UtlandsadressTYPE utlandsadress = adressTYPE.getUtlandsadress();
			if (folkbokforingsadress != null) {
				writer.write(notNull(folkbokforingsadress.getUtdelningsadress1()) + ";");
				writer.write(notNull(folkbokforingsadress.getUtdelningsadress2()) + ";");
				writer.write(notNull(folkbokforingsadress.getPostNr()) + ";");
				writer.write(notNull(folkbokforingsadress.getPostort()) + ";");
			} else {
				writer.write(";;;;");
			}

			if (sarskildPostadress != null) {
				writer.write(notNull(sarskildPostadress.getUtdelningsadress1())+ ";");
				writer.write(notNull(sarskildPostadress.getUtdelningsadress2())+ ";");
				writer.write(notNull(sarskildPostadress.getPostNr()) + ";");
				writer.write(notNull(sarskildPostadress.getPostort()) + ";");
			} else {
				writer.write(";;;;");
			}

			if (utlandsadress != null) {
				writer.write(notNull(utlandsadress.getUtdelningsadress1())+ ";");
				writer.write(notNull(utlandsadress.getUtdelningsadress2())+ ";");
				writer.write(notNull(utlandsadress.getUtdelningsadress3())+ ";");
				writer.write(notNull(utlandsadress.getPostKodUtland()) + ";");
				writer.write(notNull(utlandsadress.getPostortUtland()) + ";");
				writer.write(notNull(utlandsadress.getLand()) + ";");
			} else {
				writer.write(";;;;");
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
