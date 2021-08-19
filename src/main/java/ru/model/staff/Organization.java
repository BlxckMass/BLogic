package ru.model.staff;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "organization")
@XmlAccessorType(XmlAccessType.FIELD)
public class Organization extends Staff {

    private String name;
    private String shortName;
    private Person leader;
    private String phoneNumbers;

    public Organization() {
    }

    public Organization(String name, String shortName, Person leader, String phoneNumbers) {
        this.name = name;
        this.shortName = shortName;
        this.leader = leader;
        this.phoneNumbers = phoneNumbers;
    }

    public Organization(Long id, String name, String shortName, Person leader, String phoneNumbers) {
        super(id);
        this.name = name;
        this.shortName = shortName;
        this.leader = leader;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Person getLeader() {
        return leader;
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", leader=" + leader +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                '}';
    }

}
