package fr.univrouen.stb23v1.model.entities;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "stb")
@XmlAccessorType(XmlAccessType.FIELD)
public class STBResume {

    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "title")
    private String title;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "date")
    private String date;

    @XmlElement(name = "client-entity")
    private String clientEntity;

    public STBResume() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(String clientEntity) {
        this.clientEntity = clientEntity;
    }

    @Override
    public String toString() {
        return id + title + description + date + clientEntity;
    }
}
