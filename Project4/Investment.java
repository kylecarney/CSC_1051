//*************************************************************
//  Investment.java       Author: Kyle Carney
//  Project 4
//*************************************************************
import java.text.NumberFormat;
import java.util.Scanner;
public class Investment
{
   
public static void main (String[] args){
Scanner scan = new Scanner(System.in); 
//declare variables
int doAgain, year;
double initInvestment, tValue, intRate, startBalance, balance, interest, currentBalance;

//initialize variables
doAgain = 1;
initInvestment = 0;
tValue = 0;
year = 1;

NumberFormat fmt = NumberFormat.getCurrencyInstance();
NumberFormat fmt2 = NumberFormat.getPercentInstance();

//print do again?
while (doAgain == 1)

{  //print enter initial investment
   System.out.print("Please enter your initial investment: ");
   //input initial investment
   initInvestment = scan.nextDouble();
   
   //print enter target value
   System.out.print("Please enter your target value: ");
   //input target value
   tValue = scan.nextDouble();
   
   //print enter interest rate
   System.out.print("Please enter your interest rate (for example, enter 5 for 5%): ");
   //input interest rate
   intRate = scan.nextDouble();
   
   //test if values for initInvestment, tValue, and intRate are correct
   //System.out.print("initInvestment: " + fmt.format(initInvestment) + 
   //"tValue: " + fmt.format(tValue) + "int Rate: " + fmt2.format(intRate/100));
   
   //initialize startBalance
   startBalance = initInvestment;
   //initialize balance
   balance = startBalance;
   //initialize interest
   interest = (intRate/100)*balance;
   
   currentBalance = initInvestment;
   //print starting balance and interest rate
   System.out.print("\n\nStarting balance: " + fmt.format(startBalance) + "\t\tInterest rate: " +
   fmt2.format(intRate/100));
   
   //print table header with year, interest, and balance
   System.out.print("\n\nYear" + "\tInterest" + "\t\tBalance");
   

   //print year, interest, and balance
   System.out.print("\n" + year + "\t\t" + fmt.format(interest) + "\t\t" + fmt.format(currentBalance));
   //increment year
   year++;



   
   //print year, new interest, and new balance
   while (year < 20) {
   System.out.print("\n" + year + "\t\t" + fmt.format(interest) + "\t\t" + fmt.format(balance + interest)); 
   year++;
   }
   //print do again?
   System.out.println("\n\nWould you like to do another? (NO=0, YES=1)");
   //input do again
   doAgain = scan.nextInt();

}
   
}
}