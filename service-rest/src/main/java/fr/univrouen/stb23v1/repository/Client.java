package fr.univrouen.stb23v1.repository;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "client")
public class Client {
  @XmlElement(name = "entity")
  private String entity;

  @XmlElement(name = "person")
  private Person person;

  @XmlElement(name = "mail")
  private ArrayList<String> mail;

  @XmlElement(name = "tel")
  private ArrayList<String> tel;

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

  public ArrayList<String> getMail() {
    return mail;
  }

  public void setMail(ArrayList<String> mail) {
    this.mail = mail;
  }

  public ArrayList<String> getTel() {
    return tel;
  }

  public void setTel(ArrayList<String> tel) {
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