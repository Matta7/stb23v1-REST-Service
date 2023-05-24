package fr.univrouen.stb23v1.repository;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "team")
@XmlAccessorType(XmlAccessType.FIELD)
public class Team {
  @XmlElement(name = "member")
  private ArrayList<Member> members;

  // Getters and setters
  public ArrayList<Member> getMembers() {
    return members;
  }

  public void setMembers(ArrayList<Member> members) {
    this.members = members;
  }

  // Constructors
  public Team() {
    this.members = new ArrayList<Member>();
  }

  public Team(ArrayList<Member> members) {
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
