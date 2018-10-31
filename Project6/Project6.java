//*************************************************************
//	 Project6.java			Author: Kyle Carney
//	 Project	6				CSC 1051-1
//*************************************************************
import java.util.Scanner;
import java.util.Random;

public class Project6
{
	public static void main(String[]	args)
	{
		Scanner in = new Scanner(System.in);
		Random rand	= new	Random();
		
		//print enter your name
		System.out.print("Please enter your name: ");
		//input name
		String name	= in.nextLine();
		
		//initialize variables
		int trial =	0;
		int NUM_TRIALS	= 4;
		long numberTrials	= 4;
		int questionsRight =	0;
		long averageTime = 0;
		
		//print Hello "name"	please answer as fast as you can
		System.out.println("Hello " +	name + ", Welcome to the speed test." +
		"\n\nThere are " + NUM_TRIALS	+ " questions." +	
      "\nAnswer as fast as you can, good luck!");
		
		//while trials	< number	of	trials
		while	(trial <	NUM_TRIALS)
		{
			//print Hit	enter	when ready	 
			System.out.println("\n\nHit <ENTER> when ready.");
		
			in.nextLine();	 // wait	for user	to	hit <ENTER>
			//generate 2 random numbers
			int a	= rand.nextInt(100);
			int b	= rand.nextInt(100);
		
			//startTime	= milliseconds
			long startTime	= System.currentTimeMillis();
		
			//print which number	is	greater
			System.out.print("Which is the greater number?\n");
			//print num	a or num	b
			System.out.print(a +	" or " +	b + " = ");
			//input response
			String response =	in.nextLine();
			//convert response to integer
			int number = Integer.parseInt(response);
		
			//record	time in milliseconds
			long endTime =	System.currentTimeMillis();
		
			//initialize outcome	and greater
			int outcome;
			int greater;
		
			//if a >	b,	greater = a, else	b
			if	(a	> b)
				greater = a;
			else 
				greater = b;
		
			//if number	is	greater,	outcome is = 1	(correct)	
			if	 (number	==	greater)
				outcome = 1;
			else
				outcome = 0;
		
			//if (outcome == 1) increment	questionsRight
			if	(outcome	==	1)
				questionsRight++;

			//reaction time =	endtime - start time	 
			long reactionTime	= endTime -	startTime;
	
			//if outcome is 1	print	correct,	else print incorrect
			if	(outcome	==	1)
				System.out.println("Correct!");
			else
				System.out.println("Incorrect.");
		
			//print reaction time	
			System.out.println("That took " + reactionTime + " milliseconds");
			//average time	= average time	+ reaction time
			averageTime	= averageTime + reactionTime;
			//increment	trial
			trial++;
		}
		//print questions/total	questions right
		System.out.println("\nGreat job, you got " +	questionsRight	+ 
		"/" +	NUM_TRIALS + " questions correct!");
		//average time	= averageTime/numberTrials
		averageTime	= averageTime/numberTrials;
		//print average response time
		System.out.println("Your average response time was " + 
		averageTime	+ " milliseconds!\n");		
		//	print	goodbye
		System.out.println("Thank you "	+ name +	", goodbye.");
	}
}