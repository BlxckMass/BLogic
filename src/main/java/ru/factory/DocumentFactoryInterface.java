package ru.factory;

import ru.model.Document;

public interface DocumentFactoryInterface {
    String authors = "authors";
    String executors = "executors";
    String addressees = "addressees";
    String senders = "senders";

    Document createDocument();

}
