import java.util.Scanner;
public class ccc12s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		int A;
		int R=0;
		int R2=0;
		int Total=0;
		for (int i=l/2;i>0;i--){
			if(s.charAt(2*i-1)=='I'){
				R=1;
			}if(s.charAt(2*i-1)=='V'){
				R=5;
			}if(s.charAt(2*i-1)=='X'){
				R=10;
			}if(s.charAt(2*i-1)=='L'){
				R=50;
			}if(s.charAt(2*i-1)=='C'){
				R=100;
			}if(s.charAt(2*i-1)=='D'){
				R=500;
			}if(s.charAt(2*i-1)=='M'){
				R=1000;
			}			
			A = Character.getNumericValue(s.charAt(2*i-2));  
			

			if (R>=R2){
				Total=Total + (R*A);
			}else if(R<R2){
				Total=Total-(R*A);
			}				R2=R;


		}System.out.println(Total);
	}

}
