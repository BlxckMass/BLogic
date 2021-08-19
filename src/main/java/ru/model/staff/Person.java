package ru.model.staff;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "leader")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person extends Staff {

    private String lastName;
    private String firstName;
    private String patronymic;
    private String position;
    private Date birthDay;
    private String phone;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic, String position, Date birthDay, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.position = position;
        this.birthDay = birthDay;
        this.phone = phone;
    }

    public Person(Long id, String lastName, String firstName, String patronymic, String position, Date birthDay, String phone) {
        super(id);
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.position = position;
        this.birthDay = birthDay;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", birthDay=" + birthDay +
                ", phone='" + phone + '\'' +
                '}';
    }
}
