
import java.util.Scanner; 

public class CCC17L3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int gas = sc.nextInt();

		int x3 = Math.abs(x1 - x2);
		int y3 = Math.abs(y1 - y2);

		if ((gas-x3-y3)<0){
			System.out.println("N");
		}else if ((gas-x3-y3)==0){
			System.out.println("Y");
		}else {
			if ((gas-x3-y3)%2==0) {
				System.out.println("Y");

			}else {
				System.out.println("N");
			}


		}



	}

}
