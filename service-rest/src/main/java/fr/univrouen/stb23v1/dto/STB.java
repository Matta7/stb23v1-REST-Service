package fr.univrouen.stb23v1.repository;

import jakarta.xml.bind.annotation.*;

import javax.persistence.*;

@Entity
@Table(name = "stb")
@XmlRootElement(name = "stb", namespace = "http://univrouen.fr/stb23")
@XmlAccessorType(XmlAccessType.FIELD)
public class STB {

    /**
     * Autogenerated id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlTransient
    private Integer id;

    @XmlElement
    private String title;

    @XmlElement
    private double version;

    @XmlElement
    private String date;

    @XmlElement
    private String description;

    @XmlElement
    private Client client;

    @XmlElement
    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @XmlElement(name = "features")
    @OneToOne
    @JoinColumn(name = "feature_id")
    private Features featureList;

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Features getFeatureList() {
        return featureList;
    }

    public void setFeatureList(Features featureList) {
        this.featureList = featureList;
    }

    // Constructor
    public STB() {
    }

    public STB(String title, double version, String date, String description, Client client, Team team, Features featureList) {
        this.title = title;
        this.version = version;
        this.date = date;
        this.description = description;
        this.client = client;
        this.team = team;
        this.featureList = featureList;
    }

    // Methods
    @Override
    public String toString() {
        return "STB{" +
                "title='" + title + '\'' +
                ", version=" + version +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", client=" + client +
                ", team=" + team +
                ", featureList=" + featureList +
                '}';
    }
}
