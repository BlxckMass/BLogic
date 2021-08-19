package ru.wrapper;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "elements")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLWrapper<T> {

    @XmlElementWrapper(name = "object")
    private List<T> objects;

    public List<T> getObjects() {
        return objects;
    }
}
