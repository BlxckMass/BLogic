package ru;

import ru.model.staff.Organization;
import ru.model.staff.Person;
import ru.wrapper.OrganizationWrapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.*;

public class Application {

    public static void main(String[] args) throws JAXBException {
//        Generator.generateDocument(new IncomingFactory(), 10);
//        Generator.generateDocument(new OutgoingFactory(), 10);
//        Generator.generateDocument(new TaskFactory(), 10);
//
//        for (Map.Entry<String, TreeSet<Document>> entry : Storage.getStorage().getData().entrySet()) {
//            System.out.println(entry.getKey());
//            entry.getValue().forEach(d -> System.out.println("     " + d.toString()));
//        }

//        Organization organization = new Organization(1L, "name", "short",
//                new Person(1L, "last", "first", "patr", "pos", new Date(), "phone"), "phoneNumb");
//        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(OrganizationWrapper.class, Organization.class, Person.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller.marshal(organization, writer);

        StringReader reader = new StringReader("src/main/resources/organization.xml");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        OrganizationWrapper unmarshal = (OrganizationWrapper) unmarshaller.unmarshal(new File("src/main/resources/organization.xml"));

        unmarshal.getOrganizationList().forEach(o -> System.out.println(o.toString()));

    }

}
