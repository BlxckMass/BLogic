package ru;

import ru.factory.DocumentFactoryInterface;
import ru.factory.IncomingFactory;
import ru.factory.OutgoingFactory;
import ru.factory.TaskFactory;
import ru.model.Document;
import ru.model.Storage;

import java.util.Map;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {
        Generator.generateDocument(new IncomingFactory(), 10);
        Generator.generateDocument(new OutgoingFactory(), 10);
        Generator.generateDocument(new TaskFactory(), 10);

        for (Map.Entry<String, TreeSet<Document>> entry : Storage.getStorage().getData().entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(d -> System.out.println("     " + d.toString()));
        }
    }

}
