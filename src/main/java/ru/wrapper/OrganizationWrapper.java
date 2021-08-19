package ru.wrapper;

import ru.model.staff.Organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "organizations")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrganizationWrapper {

    @XmlElement(name = "organization")
    private List<Organization> organizationList;

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(List<Organization> organizationList) {
        this.organizationList = organizationList;
    }
}
