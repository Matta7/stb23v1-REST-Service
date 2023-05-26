package fr.univrouen.stb23v1.model.entities;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "team")
@XmlAccessorType(XmlAccessType.FIELD)
public class Team {
  /**
   * Autogenerated id.
   */
  @XmlTransient
  private Integer id;

  @XmlElement(name = "member")
  private List<Member> members;

  // Getters and setters
  public List<Member> getMembers() {
    return members;
  }

  public void setMembers(List<Member> members) {
    this.members = members;
  }

  // Constructors
  public Team() {
    this.members = new ArrayList<Member>();
  }

  public Team(List<Member> members) {
    this.members = members;
  }

  // Methods
  public void addMember(Member member) {
    this.members.add(member);
  }

  public void removeMember(Member member) {
    this.members.remove(member);
  }

  public Member getMember(int index) {
    return this.members.get(index);
  }

  public int size() {
    return this.members.size();
  }

  public boolean isEmpty() {
    return this.members.isEmpty();
  }

  public boolean contains(Member member) {
    return this.members.contains(member);
  }

  public void clear() {
    this.members.clear();
  }

  // Methods

  public String toString() {
    String str = "Team{\n";
    for (Member member : this.members) {
      str += member.toString() + "\n";
    }
    str += "}";
    return str;
  }
  
}
