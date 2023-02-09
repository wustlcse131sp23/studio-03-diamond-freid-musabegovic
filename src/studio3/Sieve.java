package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to check?");
		n = scan.nextInt();
		
		boolean[] numbers = new boolean[n +1];
		for (int i = 2; i<=n; i++)
		{ 
			numbers [i] = true;	
		}
		
		for (int i=2; i<=Math.sqrt(n); i++)
		{
			for (int j = 2; j <= n/i; j++)
			{
				numbers [i*j]= false;
			}
		}
		
	for (int i= 2; i<=n; i++)
	{
		if (numbers[i] == true)
		{
			System.out.println(i + " is a prime number");
		}
	}
	}

}
