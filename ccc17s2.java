import java.util.*;
public class ccc17s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int[] a = new int[N];
for (int r=0;r<N;r++){
	a[r] = sc.nextInt();
}
Arrays.sort(a);
if(N % 2 == 0){
for(int r=0;r<N/2;r++){
	System.out.print(a[N/2-1-r]+" "+a[N/2+r]+" ");
}
	}
	
	else{
		for(int r=0;r<(N+1)/2;r++){
			System.out.print(a[(N+1)/2-1-r]);
			if(r!=(N+1)/2-1){
				System.out.print(" "+a[(N+1)/2+r]+" ");
			}
		}
	}
}
}