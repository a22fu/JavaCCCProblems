import java.util.Scanner;
public class ccc03s2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
String[] s = new String[4*N];
String[] syl = new String [4*N];
for(int i=0;i<4;i++){
	s[i]=sc.nextLine();
}
for(int i=0;i<N;i++){

	for(int r=0;r<4;r++){
		for(int c=s[r].length()-1;c>0;c--){
			if(s[r].charAt(c)=='a'||s[r].charAt(c)=='e'||s[r].charAt(c)=='i'||s[r].charAt(c)=='o'||s[r].charAt(c)=='u'){
				syl[r]=s[r].substring(c);
				break;
			}else if(s[r].charAt(c)==' '){
				syl[r]=s[r].substring(c+1);
break;
			}
		}
	}if(syl[1]==syl[3]&&syl[0]==syl[2]&&syl[1]==syl[0]){
		System.out.println("perfect");

	}else if(syl[1]==syl[3]&&syl[0]==syl[2]){
		System.out.println("cross");
	}else if(syl[0]==syl[3]&&syl[1]==syl[2]){
		System.out.println("shell");
	}else if(syl[0]==syl[1]&&syl[2]==syl[3]){
		System.out.println("even");
	}else{
		System.out.println("free");
	}

}


	}
}
