import java.util.Scanner;
import java.util.LinkedList;
public class CCC14s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		LinkedList<String> q1 = new LinkedList<String>();
		for (int i =0; i<N;i++){
			q1.add(sc.next());
		}
		LinkedList<String> q2 = new LinkedList<String>();
		for (int i =0; i<N;i++){
			q2.add(sc.next());
		}



		//read one by one to do the comparison
		for(int i=0;i<N;i++){
			String S1 = q1.get(i);
			String S2 = q2.get(i);
			if (S1.equals(S2)){
			System.out.print("bad");
			return;
			}
			int index = q2.indexOf(S1);
			if (!S2.equals(q1.get(index))){
				System.out.print("bad");
				return;
			}
		}
		System.out.print("good");

	}

}
