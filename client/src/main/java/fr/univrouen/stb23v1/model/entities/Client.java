package fr.univrouen.stb23v1.model.entities;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

  /**
   * Autogenerated id.
   */
  @XmlTransient
  private Integer id;

  @XmlElement(name = "entity")
  private String entity;

  @XmlElement(name = "person")
  private Person person;

  @XmlElement(name = "mail")
  private List<String> mail;

  @XmlElement(name = "tel")
  private List<String> tel;

  // Getters and setters

  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public List<String> getMail() {
    return mail;
  }

  public void setMail(List<String> mail) {
    this.mail = mail;
  }

  public List<String> getTel() {
    return tel;
  }

  public void setTel(List<String> tel) {
    this.tel = tel;
  }

  // Constructors

  public Client() {
  }

  public Client(String entity, Person person, ArrayList<String> mail, ArrayList<String> tel) {
    this.entity = entity;
    this.person = person;
    this.mail = mail;
    this.tel = tel;
  }

  // Methods
  @Override
  public String toString() {
    return "Client{" +
            "entity='" + entity + '\'' +
            ", person=" + person +
            ", mail=" + mail +
            ", tel=" + tel +
            '}';
  }
}