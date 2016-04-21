package at.darkgate.lib.lenex.model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * All data of a club at the meet
 */
@XmlRootElement(name = "CLUB")
@XmlSeeAlso({Athlete.class, Relay.class, Official.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class Club {
    @XmlElementWrapper(name="ATHLETES")
    @XmlElement(name="ATHLETE")
    private List<Athlete> athletes;

    @XmlElementWrapper(name="RELAYS")
    @XmlElement(name="RELAY")
    private List<Relay> relays;

    @XmlElementWrapper(name="OFFICIALS")
    @XmlElement(name="OFFICIAL")
    private List<Official> officials;
}
