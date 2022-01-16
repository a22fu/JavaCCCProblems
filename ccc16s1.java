import java.util.LinkedList;
import java.util.Scanner;
public class ccc16s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		//read char one by one from S1
		//check if S2 has matching char, if yes. remove the char
		// if no output N
		LinkedList<Character> queue = new LinkedList<Character>();
		for (int i =0;i<S2.length();i++){
			queue.add(S2.charAt(i));
		}
		for (int i =0;i<S1.length();i++){
			char c = S1.charAt(i);
			int index = queue.indexOf(c);//-1 means c is not there
			if (index != -1){
				queue.remove(index);

			}else{
				index = queue.indexOf('*');
				if (index==-1){
					System.out.print("N");
					return;

				}else{
					queue.remove(index);
				}

			}




		}
System.out.print("A");

	}

}
