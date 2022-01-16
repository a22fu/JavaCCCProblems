import java.util.Scanner;
public class ccc04s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean t=false;
		for(int i=0; i<N;i++){
			String[] s = new String[3];
			s[0]=sc.next();
			s[1]=sc.next();
			s[2]=sc.next();

			if(s[0].startsWith(s[1])||s[0].startsWith(s[2])||s[1].startsWith(s[2])||s[1].startsWith(s[0])||s[2].startsWith(s[0])||s[2].startsWith(s[1])||s[0].endsWith(s[1])||s[0].endsWith(s[2])||s[1].endsWith(s[2])||s[1].endsWith(s[0])||s[2].endsWith(s[0])||s[2].endsWith(s[1])){
		System.out.println("No");

				
			}else{
				System.out.println("Yes");
			}
	
		}
		
		
		
		
		
		
	}
}
