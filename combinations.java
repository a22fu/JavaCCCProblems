import java.util.Scanner;

public class combinations {
	public static int[] memo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
		
memo = new int[1000000];

		System.out.print(comb(n,k));
	}
public static int comb(int n, int k){
	if(k==n||k==1){
		return 1;
	}else if(n<k){
		return 0;

	}else{
		memo[n] = comb(n-1,k-1) + comb(n-k,k);
		return memo[n];
	}
}
}
