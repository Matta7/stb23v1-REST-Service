package fr.univrouen.stb23v1.repository;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "person")
public class Person {
  @XmlAttribute(name = "gender")
  private String gender;

  @XmlAttribute(name = "lastname")
  private String lastname;

  // Getters and setters
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  // Constructors

  public Person() {
  }

  public Person(String gender, String lastname) {
    this.gender = gender;
    this.lastname = lastname;
  }

  // Methods
  @Override
  public String toString() {
    return "Person";
  }
}
