import java.util.LinkedList;
import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0;
	LinkedList<String> queue2 = new LinkedList<String>();
	for (int i= 0;i<4;i++){
		queue2.add(sc.nextLine());
	}

	for (int i= 0;i<4;i++){
		String s = queue2.poll();
		
		if	(s.startsWith("ABC")==true){
			r=r+1;
		}
	}
	System.out.println(r);

}
}
