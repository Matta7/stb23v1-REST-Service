package fr.univrouen.stb23v1.model.entities;

import jakarta.xml.bind.annotation.*;


@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
  /**
   * Autogenerated id.
   */
  @XmlTransient
  private Integer id;

  @XmlValue
  private String firstname;

  @XmlAttribute(name = "gender")
  private String gender;

  @XmlAttribute(name = "lastname")
  private String lastname;

  // Getters and setters
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

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
    String str = "Person{\n";
    str += "person=" + lastname + "\n";
    str += "lastname=" + firstname + "\n";
    str += "gender=" + gender + "\n";
    str += "}";
    return str;
  }
}