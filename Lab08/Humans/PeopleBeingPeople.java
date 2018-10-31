//******************************************************************
// PeopleBeingPeople.java Author: YOUR NAME HERE
//
// Driver class to test Person class.
//******************************************************************

public class PeopleBeingPeople
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
 
 // main(): creates some Person objects, prints their info.
 // Instantiate three objects of the Person class, assign them
 // to variables named friend1, friend2, friend3.
 // (Use names and ages of your choice.)
 Person friend1 = new Person ("Chris", 39);
 Person friend2 = new Person ("Kevin", 28);
 Person friend3 = new Person ("Caitlin", 27);
 // Print out info about friend1, friend2, friend3.
 System.out.println(friend1);
 System.out.println(friend2);
 System.out.println(friend3);
 
 //create friend4 with new constructor
 Person friend4 = new Person ("Cameron");
 //print out new friend4
 //System.out.println(friend4);
 
 //birthday for friend4
 friend4.birthday();
 //print friend4
 System.out.println(friend4);
 
 //compute and print average for all ages of the four friends
 int totalAge = friend1.getAge() + friend2.getAge() + friend3.getAge() + friend4.getAge();
 int averageAge = totalAge / 4;
 System.out.println("Average age of friends is " + averageAge);
   }
}