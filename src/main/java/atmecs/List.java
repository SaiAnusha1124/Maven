package atmecs;
import java.util.Scanner;
public class List 
{
		Scanner s = new Scanner(System.in);
		public void Factorial() 
		{
			int n, fact = 1;
			System.out.println("\nEnter n number");
			n = s.nextInt();
			for (int i = 1; i <= n; i++) 
			{
				fact = fact * i;
			}
			System.out.println("Factorial is :" + fact);
		}
		public void Fibonacci() 
		{
			System.out.println("\nEnter n number");
			int n, num1 = 0, num2 = 0, result = 1;
			int count = 0;
			n = s.nextInt();
			System.out.print("Fibanocci is ");
			for (int i = 1; i <= n; i++) 
			{
				num1 = num2;
				num2 = result;
				result = num1 + num2;
				System.out.print(num1 + " ");
			}
		}
		public void Firstprimenumber() 
		{
			System.out.println("\nEnter prime number");
			int n = s.nextInt();
			int count = 0;
			while (count != 2) 
			{
				n++;
				int i = 1;
				count = 0;
				while (i <= n) 
				{
					if (n % i == 0) 
					{
						count++;
					}
					i++;
				}
				if (count == 2) 
				{
					System.out.println("next immediate prime number is" + n);
				}
			}
		}
	}
