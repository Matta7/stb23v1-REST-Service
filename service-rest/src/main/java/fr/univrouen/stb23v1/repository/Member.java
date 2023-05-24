package fr.univrouen.stb23v1.repository;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "member")
@XmlAccessorType(XmlAccessType.FIELD)
public class Member {
  @XmlElement(name = "person")
  private Person person;

  @XmlElement(name = "mail")
  private String mail;

  @XmlElement(name = "function")
  private ArrayList<String> functions;

  // Getters and setters

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public ArrayList<String> getFunctions() {
    return functions;
  }

  public void setFunctions(ArrayList<String> functions) {
    this.functions = functions;
  }

  // Constructors

  public Member() {
    this.functions = new ArrayList<String>();
  }

  public Member(Person person, String mail, ArrayList<String> functions) {
    this.person = person;
    this.mail = mail;
    this.functions = functions;
  }

  // Methods

  public void addFunction(String function) {
    this.functions.add(function);
  }

  public void removeFunction(String function) {
    this.functions.remove(function);
  }

  public String getFunction(int index) {
    return this.functions.get(index);
  }

  public int size() {
    return this.functions.size();
  }

  public boolean isEmpty() {
    return this.functions.isEmpty();
  }

  public boolean contains(String function) {
    return this.functions.contains(function);
  }

  public void clear() {
    this.functions.clear();
  }

  public String toString() {
    String str = "Member{\n";
    str += "person=" + this.person.toString() + "\n";
    str += "mail=" + this.mail.toString() + "\n";
    str += "functions=[";
    for (String function : this.functions) {
      str += function + ", ";
    }
    str += "]\n";
    str += "}";
    return str;
  }
}