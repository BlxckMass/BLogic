package ru.model.staff;

public class Department extends Staff {

    private String name;
    private String shortName;
    private Person leader;
    private String phoneNumbers;

    public Department() {
    }

    public Department(String name, String shortName, Person leader, String phoneNumbers) {
        this.name = name;
        this.shortName = shortName;
        this.leader = leader;
        this.phoneNumbers = phoneNumbers;
    }

    public Department(Long id, String name, String shortName, Person leader, String phoneNumbers) {
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
}
