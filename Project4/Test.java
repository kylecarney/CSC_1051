//*************************************************************
//  Test.java       Author: Kyle Carney
//  Project 4
//*************************************************************
import java.text.NumberFormat;
import java.util.Scanner;
public class Test
{
   
public static void main (String[] args){
Scanner scan = new Scanner(System.in); 
//declare variables
int doAgain, year;
double initialInvestment, tValue, intRate,  balance, interest;

//initialize variables
doAgain = 1;
tValue = 0;
year = 1;

NumberFormat fmt = NumberFormat.getCurrencyInstance();
NumberFormat fmt2 = NumberFormat.getPercentInstance();

//print do again?
while (doAgain == 1)

{  //print enter initial investment
   System.out.print("Please enter your initial investment: ");
   //input initial investment
   initialInvestment = scan.nextDouble();
   
   //print enter target value
   System.out.print("Please enter your target value: ");
   //input target value
   tValue = scan.nextDouble();
   
   //print enter interest rate
   System.out.print("Please enter your interest rate (for example, enter 5 for 5%): ");
   //input interest rate
   intRate = scan.nextDouble();
   
   //print starting balance and interest rate
   System.out.print("\n\nStarting balance: " + fmt.format(initialInvestment) + "\t\tInterest rate: " +
   fmt2.format(intRate/100));
   
   //print table header with year, interest, and balance
   System.out.println("\n\nYear" + "\tInterest" + "\t\tBalance");
   
   //initialize variables 
   interest = initialInvestment * (intRate / 100);
   balance = interest + initialInvestment;
   
   //print year, interest, and balance values
   System.out.println(year + "\t\t" + fmt.format(interest) + "\t\t" + fmt.format(balance));
   
   while (balance < tValue) {
   year++;
   initialInvestment = balance;
   interest = initialInvestment * (intRate/100);
   balance = interest + balance;
   System.out.println(year + "\t\t" + fmt.format(interest) + "\t\t" + fmt.format(balance));
   



}

   //print do again?
   System.out.println("\n\nWould you like to do another? (NO=0, YES=1)");
   //input do again
   doAgain = scan.nextInt();


}   
}
}