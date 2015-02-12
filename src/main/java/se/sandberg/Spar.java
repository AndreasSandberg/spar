package se.sandberg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import se.skatteverket.spar.instans._1.ObjectFactory;
import se.skatteverket.spar.instans._1.SPARInfilPersonNrManuell;
import se.skatteverket.spar.komponent._1.PersonIdTYPE;

public class Spar {

	public static void main(String[] args) throws JAXBException, IOException {
		if(args.length != 1){
			System.out.println("Usage: Spar path-to-indata-file");
			System.exit(-1);
		}
		File file = new File(args[0]);
		List<String> lines = Files.readAllLines(file.toPath());
		JAXBContext context = JAXBContext.newInstance(SPARInfilPersonNrManuell.class);
		
		ObjectFactory of = new ObjectFactory();
		SPARInfilPersonNrManuell createSPARInfilPersonNrManuell = of.createSPARInfilPersonNrManuell();
		for(String line : lines){
			PersonIdTYPE personIdTYPE = new PersonIdTYPE();
			personIdTYPE.setFysiskPersonId(line);
			createSPARInfilPersonNrManuell.getPersonId().add(personIdTYPE);
		}

		File outputFile = new File(file.getAbsolutePath() + ".xml");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
		marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://skatteverket.se/spar/instans/1.0 http://www.statenspersonadressregister.se/Filarkiv/XMLSchema/20140315/SPARInfilPersonNrManuell.xsd");
		marshaller.marshal(createSPARInfilPersonNrManuell, outputFile);
		
	}

}
