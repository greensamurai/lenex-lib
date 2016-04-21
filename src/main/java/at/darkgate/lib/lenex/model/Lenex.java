package at.darkgate.lib.lenex.model;

import javax.xml.bind.annotation.*;

/**
 * Created by Laszlo on 20.04.2016.
 */
@XmlRootElement (name = "LENEX")
@XmlSeeAlso(Constructor.class)
@XmlAccessorType(XmlAccessType.FIELD)
public class Lenex {
    @XmlAttribute
    private String version;

    @XmlElement (name = "CONSTRUCTOR")
    private Constructor constructor;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }
}
