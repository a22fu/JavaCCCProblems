import java.util.Scanner;
public class ccc10s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s= "";
		String s2="";
		String[] c = new String[T];
		String[] n = new String[T];
		int count = 0;
		for (int i =0; i<T;i++){
			c[i] = sc.next();
			n[i] = sc.next();


		
		}
		s = sc.next();
		while(!s.isEmpty()){
		for(int i=0;i<T;i++){
			String ad = n[i];
			if(s.startsWith(ad)){
				
				s=s.replaceFirst(ad, "");
				s2 = s2 +c[i];
				
				
			}
			
		}
	}
	System.out.print(s2);
	}
		}
		
		
		
		
		
	

