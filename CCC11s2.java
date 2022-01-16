import java.util.Scanner;
public class CCC11s2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int mark =0;
    	String[] mar = new String[N];
    	String[] stu = new String[N];
    	
    	for (int i = 0;i<N;i++){
    		mar[i] = sc.next();
    	}
    	for (int i = 0;i<N;i++){
    		stu[i] = sc.next();
    	}
    	for (int i = 0;i<N;i++){
    		if(stu[i].equals(mar[i])){
    			mark++;
    		}
    	}
    	System.out.print(mark);
    }
}
