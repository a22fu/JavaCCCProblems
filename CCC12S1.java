import java.util.Scanner;
public class CCC12S1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int J = sc.nextInt();
	int count = 4;
	int number = 1;
	if(J>=4){

		System.out.println((J-1)*(J-2)*(J-3)/6);
	}else{
		System.out.println("0");
	}
	}
}
