package popshk.XmlAndJsonPars;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "trainList")
public class Trains {

    private int id;
    private String from;
    private String to;
    private Date date;
    private Date departure;

    public Trains(){};

    public Trains(int id, String from, String to, Date date, Date departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }
    @XmlElement
    public void setFrom(String from) {
        this.from = from;
    }
    @XmlElement
    public void setTo(String to) {
        this.to = to;
    }
    @XmlElement
    public void setDate(Date date) {
        this.date = date;
    }
    @XmlElement
    public void setDeparture(Date departure) {
        this.departure = departure;
    }
}
