import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CCC15j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		input N as message number
		int N  = sc.nextInt();
//		Create a send  array with size 101
		int[] receive = new int[101];
//		Create a reply array with size 101
		int[] reply = new int[101];
//		Create a wait array with size 101
		int[] wait = new int[101];
//		input N lines as action and friend
		int time = 0;
		for (int i=0; i<N; i++) {
			String action = sc.next();
			int F = sc.nextInt();
			time++;
		    if (action.equals("W")) {
				time+=F;
				time-=2;
			}
		    if (action.equals("R")) {
		    		receive[F] = time;
		    		reply[F] = -1;
		    } else if (action.equals("S")) {
		    		wait[F] += time - receive[F];
		    		reply[F] = time;
		    }
			
		}
		
//		Starting from time = 0;
//		and record time to 3 arrays
		for (int i=1; i<101; i++) {
			if (reply[i]==-1) {
				System.out.println(i+" -1");
			} else if (reply[i]!=0) {
				System.out.println(i+" "+wait[i]);
			}
		}
		
		
		
		
		
	}

}