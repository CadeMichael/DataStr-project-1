/**
 * the Person class represents a person that will be in the bankqueue and extends entry 
 * @author Cade Lueker
 */
public class Person extends Entry {
  /** name holds the name of the person entry*/
  private String name;
  /** surname holds the surname of the person entry*/
  private String surname;
  
  /**
   * @constructor sets the name and surname
   * @param n is set to name
   * @param s is set to surname
   */
  public Person(String n, String s) {
    this.name = n;
    this.surname = s;
  }
  
  /**
   * set the name of the person
   * @param n is the name that will be set
   */
  public void setName(String n) {
    this.name = n;
  }
  
  /**
   * set the surname of the person
   * @param s is the surname that will be set
   */
  public void setSurname(String s) {
    this.surname = s;
  }
  
  /**
   * return the name of the person
   * @return the name of the person
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * return the surname of the person
   * @return the surname of the person
   */
  public String getSurname() {
    return this.surname;
  }
 
  /**
   * overriding the toString method to give a better representation of the person
   * @return a String showing the name, surname, and position
   */
  @Override
  public String toString() {
    return "name: "+this.name +" "+ this.surname +" & posiotion: "+ this.getPosition();
  }
  
  /**
   * make the equals method to compare the name and surname of two persons
   * @return a boolean showing if the name and surname are the same
   */
  public boolean equals(Person p) {
    if (this.name == p.getName() && this.surname == p.getSurname())
      return true;
    else
      return false;
  }
}