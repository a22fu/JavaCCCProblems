import java.util.Scanner;
public class TowerofHanoi {
	public static void main(String[] args) {
		//N plate how many times you will move from plate a to c
		System.out.print(Hanoi(9));

		
	}

	public static int Hanoi(int n){
		if (n==1){
			return 1;
		}
		else{
		return 2*Hanoi(n-1)+1;
		}
	}
}


