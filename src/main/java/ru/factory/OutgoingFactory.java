package ru.factory;

import ru.exception.DocumentExistsException;
import ru.model.Document;
import ru.model.Outgoing;
import ru.model.Storage;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class OutgoingFactory implements DocumentFactoryInterface {

    private final Random random = new Random();

    @Override
    public Document createDocument() {
        Outgoing document = new Outgoing();
        Date date = new Date(ThreadLocalRandom.current().nextLong(0L, 1629284699L * 1000));

        document.setId(Math.abs(random.nextLong()));
        document.setAuthor(Document.defaultValues.get(authors).get(random.nextInt(Document.defaultValues.get(authors).size())));
        document.setName(UUID.randomUUID().toString());
        document.setText("text " + UUID.randomUUID());
        document.setRegistrationNumber(Math.abs(random.nextLong()));
        document.setDateOfRegistration(date);

        document.setAddressee(Document.defaultValues.get(addressees).get(random.nextInt(Document.defaultValues.get(addressees).size())));
        document.setDeliveryMethod("method");
        Storage storage = Storage.getStorage();
        try {
            storage.save(document, document.getAuthor());
            return document;
        } catch (DocumentExistsException e) {
            e.printStackTrace();
            return null;
        }
    }

}
