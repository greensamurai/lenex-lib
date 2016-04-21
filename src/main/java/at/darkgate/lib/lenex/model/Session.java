package at.darkgate.lib.lenex.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The schedule and event details of a meet
 */
@XmlRootElement(name = "SESSION")
//@XmlSeeAlso(Session.class)
@XmlAccessorType(XmlAccessType.FIELD)
public class Session {
    @XmlAttribute
    // format
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
