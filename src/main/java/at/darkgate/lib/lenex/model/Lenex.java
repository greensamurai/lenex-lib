package at.darkgate.lib.lenex.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The root of the Lenex tree
 */
@XmlRootElement (name = "LENEX")
@XmlSeeAlso({Constructor.class, Meet.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class Lenex {
    @XmlAttribute
    private String version;

    @XmlElement (name = "CONSTRUCTOR")
    private Constructor constructor;

    @XmlElementWrapper(name="MEETS")
    @XmlElement(name="MEET")
    private List<Meet> meets;

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

    public List<Meet> getMeets() {
        return new ArrayList<>(meets);
    }

    public void setMeets(List<Meet> meets) {
        this.meets = meets;
    }
}
