import java.util.Scanner;
import java.lang.Math; 

public class ccc09s1 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int n = 0;
 for (int i=0; i<=Math.cbrt(b); i++){
	 if(Math.pow(i,3)>=a && Math.pow(i,3)<=b&& Math.floor(Math.sqrt(Math.pow(i,3)))==Math.sqrt(Math.pow(i,3))){
		 n++;
	 }
 }
 System.out.println(n);
 
 
	}

}
