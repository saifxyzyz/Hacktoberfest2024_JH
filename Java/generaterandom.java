// Java program to demonstrate working of 
// Math.random() to generate random numbers
import java.util.*;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class generateRandom
{
	public static void main(String args[])
	{
		Random rand = new Random();
		int n1 = rand.nextInt(100);
		int count = 0;
		// System.out.println("Random number is "+n1);
		while(true){
			Scanner num = new Scanner(System.in);
			int uNum;
			System.out.print("Enter your guess: ");
			uNum = num.nextInt();
			if(uNum == n1){
				count++;
				System.out.print("Correct!!!");
				System.out.println('\n' +"Total number of attempts: " + count);
				break;

			} else if(uNum > n1){
				System.out.print("Too high" + '\n');
				count++;
				
			} else if(uNum < n1){
				System.out.println("Too low");
				count++;
				

			} else{
				System.out.println("Invalid input");
			}
		}


	}
}
