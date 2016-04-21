package at.darkgate.lib.lenex.model;

import javax.xml.bind.annotation.*;

/**
 * Information about the creator of the file
 */
@XmlRootElement (name = "CONSTRUCTOR")
@XmlSeeAlso(Contact.class)
@XmlAccessorType(XmlAccessType.FIELD)
public class Constructor {
    @XmlAttribute
    private String name;

    @XmlAttribute
    private String registration;

    @XmlAttribute
    private String version;

    @XmlElement (name = "CONTACT")
    private Contact contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
