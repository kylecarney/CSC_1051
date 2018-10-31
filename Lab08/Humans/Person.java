//******************************************************************
// Person.java Author: YOUR NAME HERE
// Represents a person, with attributes: name, age.
//******************************************************************
 
 public class Person
{
 // instance variables: name, age
 String name;
 int age;
 
 //---------------------------------------------------------------
 // Person Constructor: Sets up the person by defining the name, and age
 //---------------------------------------------------------------
 //---------------------------------------------------------------
 public Person (String x, int y)
 {
 name = x;
 age = y;
 }
  //---------------------------------------------------------------
 // toString():returns a String describing this person, eg:
 // "Jasmine, 19"
 //---------------------------------------------------------------
 public String toString ()
 {
 return (name + ", " + age);
 }
  //---------------------------------------------------------------
 // Person Constructor: Sets up the person by defining the name, and age
 //---------------------------------------------------------------
 //---------------------------------------------------------------
 public Person (String x)
 {
 name = x;
 }
  //---------------------------------------------------------------
 // birthday(): increases age by one.
 //---------------------------------------------------------------
 public int birthday()
 {
 age = age + 1;
 return age;
 }
 //---------------------------------------------------------------
 // getAge(): returns the age of this person
 //---------------------------------------------------------------
 public int getAge()
 {
 return (age);
 }
  //---------------------------------------------------------------
 // setName(String x): changes the name of this Person to x
 //---------------------------------------------------------------
 public String setName()
 {
 name = "x";
 return name;
 }
 //---------------------------------------------------------------
 // getName(): returns the name of this person
 //---------------------------------------------------------------
  public String getName()
 {
 return name;
 }
 }
 