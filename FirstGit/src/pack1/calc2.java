package pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hi, Enter your name");
		Scanner name = new Scanner (System.in);
		String name1 = name.nextLine();
		
		
		System.out.println("Enter your Age");
		Scanner age = new Scanner (System.in);
		String age1 = age.nextLine();
		
		int altura;
		Scanner alt = new Scanner (System.in);
		do {
			try{ System.out.println("Enter your hign in Centimeters");
			altura =alt.nextInt(); 
			
			
			
			
			
			
			break;}
			catch (InputMismatchException e) 
			{System.out.println("Enter a valid number");
			alt.nextLine();
			continue;}

			
			
			
		}while(true);
		
		
	
		int peso;
		Scanner pes = new Scanner (System.in);
		do {
			try{ System.out.println("Enter your weght in KG");
			peso =pes.nextInt(); 
			break;}
			catch (InputMismatchException e)
			{System.out.println("Enter a valid number");
			pes.nextLine();
			continue;}
			
			
			
			
			
		}while(true);
		
		
		
		
		
		
		

		double IMC;
		IMC = peso / Math.pow((altura*.01)/ 1.0, 2.0); 
		
	
		System.out.println(IMC);
		
		
		if (IMC <= 25 && IMC!=0) {
			System.out.println("You are healthy");
		} else if (IMC > 25)	{
			System.out.println("You are overweight");
		
		
		}
		
		
		
		
		
		
		
		
	}

}
