package ru.model;

import ru.exception.DocumentExistsException;

public interface Storable {

    void save(Document document, String author) throws DocumentExistsException;

}
