import java.util.Scanner;
public class Recursion {
public static int[] memo;
	public static void main(String[] args) {
//Recursion is function that calls itself
		//current step relies on previous step
		//base to start
		//Factorial
		//7! = 7*6! 
		//6! = 6*5!
		//5! = 5*4!
		
		//n! = n*(n-1)!
		memo = new int[51];
		System.out.print(fibonacci(50));

	}
	public static int fibonacci(int n){
		if (n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else if (memo[n]!=0){
			return memo[n];
		}else{
			memo[n] = fibonacci(n-1) + fibonacci(n-2);
			return memo[n];

		}
	}
public static int factorial(int n){
	if (n==1){
		return 1;
	} else {
		n= n*factorial(n-1);
		return n;
}
}
}
