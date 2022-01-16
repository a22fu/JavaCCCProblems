import java.util.Scanner;
public class ccc06s2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		char[] e = s1.toCharArray();
		char[] d = s2.toCharArray();
		int cout = 0;
		for(int i =0;i<s3.length();i++){
			
		for(int c = 0;c<s2.length();c++){
			if(d[c]==s3.charAt(i)){
				System.out.print(e[c]);
				cout=1;
				break;
			}
				
			
				
		}if (cout==0){
			System.out.print(".");
			
		}cout=0;
		
		}
	}

}
