package atmecs;

import java.util.Scanner;

public class Implementation extends List
{
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			int n;
			List l = new List();
			System.out.println("Enter the number");
			System.out.println(" 1. Factorial \n 2. Fibonacci\n 3. First prime number\n");
			n = s.nextInt();
			switch (n)
			{
			case 1:
				System.out.println("Factorial");
				l.Factorial();
				break;
			case 2:
				System.out.println("Fibonacci");
				l.Fibonacci();
				break;
			case 3:
				System.out.println("First prime number");
				l.Firstprimenumber();
				break;
			default:
				System.out.println("INVALID INPUT");
				break;

			}
		}
	}
