package at.darkgate.lib.lenex.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The root for a meet sub tree
 */
@XmlRootElement(name = "MEET")
@XmlSeeAlso({Session.class, Club.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class Meet {
    @XmlAttribute
    private String city;

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String course;

    @XmlAttribute
    // Date format 2016-04-15
    private String deadline;

    @XmlAttribute
    private String hostclub;

    @XmlAttribute(name = "hostclub.url")
    private String hostclubUrl;

    @XmlAttribute
    private String nation;

    @XmlAttribute
    private String organizer;

    @XmlAttribute(name = "organizer.url")
    private String organizerUrl;

    @XmlAttribute
    private String reservecount;

    @XmlAttribute(name = "result.url")
    private String resultUrl;

    @XmlAttribute
    private int startMethod;

    @XmlAttribute
    private String state="NO";

    @XmlAttribute
    private String timing="AUTOMATIC";

    @XmlAttribute
    // Date format 2016-04-15
    private String withdrawUntil;

    @XmlElementWrapper(name = "SESSIONS")
    @XmlElement(name = "SESSION")
    private List<Session> sessions;

    @XmlElementWrapper(name = "CLUBS")
    @XmlElement(name = "CLUB")
    private List<Club> clubs;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getHostclub() {
        return hostclub;
    }

    public void setHostclub(String hostclub) {
        this.hostclub = hostclub;
    }

    public String getHostclubUrl() {
        return hostclubUrl;
    }

    public void setHostclubUrl(String hostclubUrl) {
        this.hostclubUrl = hostclubUrl;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getOrganizerUrl() {
        return organizerUrl;
    }

    public void setOrganizerUrl(String organizerUrl) {
        this.organizerUrl = organizerUrl;
    }

    public String getReservecount() {
        return reservecount;
    }

    public void setReservecount(String reservecount) {
        this.reservecount = reservecount;
    }

    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
    }

    public int getStartMethod() {
        return startMethod;
    }

    public void setStartMethod(int startMethod) {
        this.startMethod = startMethod;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getWithdrawUntil() {
        return withdrawUntil;
    }

    public void setWithdrawUntil(String withdrawUntil) {
        this.withdrawUntil = withdrawUntil;
    }

    public List<Session> getSessions() {
        return new ArrayList<>(sessions);
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public List<Club> getClubs() {
        return new ArrayList<>(clubs);
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }
}
