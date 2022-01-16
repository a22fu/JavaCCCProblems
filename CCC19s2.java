import java.util.Scanner; 

public class CCC19s2{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int T = sc.nextInt(); 
for (int i=0;i<T;i++) {
	int N = sc.nextInt();
	
	for (int A = 2;A<=2*N;A++){
		int B = 2*N-A;
		if (isPrime(A) && isPrime (B)){
			System.out.println(A+" "+B);
			break;
		}
		
	}
	//A=i         B=?
	//A+b = 2N
	
	
}




}




	public static boolean isPrime(int Num){
	
		if (Num==1) {
		return false;
	}
		
		for (int i=2; i<=Num-1;i++){
			if(Num%i==0){   //i is Num's divisor
				return false;
			}
		
		}
	return true;
	

}

}
	


