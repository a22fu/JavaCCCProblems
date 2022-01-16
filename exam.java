import java.util.*;
public class exam {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] a = new int[3][3];
for(int r=0;r<3;r++){
	for(int c=0;c<3;c++){
a[r][c] = sc.nextInt();
	}
}
int minr=0;
int minc=0;
int min=Integer.MAX_VALUE;
for(int r=0;r<3;r++){
	for(int c=0;c<3;c++){
if(a[r][c]<min){
	min=a[r][c];
	minr=r;
	minc=c;
}
	}

}System.out.print(minr+" "+minc);
}
}