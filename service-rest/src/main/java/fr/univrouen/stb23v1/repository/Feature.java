package fr.univrouen.stb23v1.repository;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "feature")
public class Feature {
  @XmlElement(name = "description")
  private String description;

  @XmlElement(name = "priority")
  private int priority;

  @XmlElement(name = "delivery")
  private String delivery;

  @XmlElement(name = "comment")
  private String comment;

  @XmlAttribute(name = "name")
  private String name;
  
  @XmlAttribute(name = "section")
  private int section;
  
  @XmlAttribute(name = "number")
  private int number;

  // Getters and setters

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public String getDelivery() {
    return delivery;
  }

  public void setDelivery(String delivery) {
    this.delivery = delivery;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  //Constructors
  public Feature() {
  }

  public Feature(String description, int priority, String delivery, String comment) {
    this.description = description;
    this.priority = priority;
    this.delivery = delivery;
    this.comment = comment;
  }

  //Methods
  @Override
  public String toString() {
    return "Feature{" +
            "description='" + description + '\'' +
            ", priority=" + priority +
            ", delivery='" + delivery + '\'' +
            ", comment='" + comment + '\'' +
            '}';
  }
}
