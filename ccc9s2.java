import java.util.Scanner;
import java.util.LinkedList;
public class ccc9s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int L = sc.nextInt();
		sc.nextLine();
		LinkedList<String> pre = new LinkedList<String>();
		LinkedList<String> cur = new LinkedList<String>();
		String[] light = new String[R];
		for (int r=0;r<R;r++){
			light[r] = sc.nextLine().replaceAll(" ", "");
		}
		pre.add(light[0]);
		for(int r=1;r<R;r++){
			cur = new LinkedList<String>();
			cur.add(light[r]);
			for (int i=0;i<pre.size();i++){
				String newS="";
				for (int c=0;c<L;c++){
					if (light[r].charAt(c)==pre.get(i).charAt(c)){
						newS+="0";
					}else{
						newS+= "1";
					}
				}
				if(cur.indexOf(newS)== -1){
					cur.add(newS);
				}
			}
			pre=cur;
		}
System.out.print(cur.size());
	}

}
