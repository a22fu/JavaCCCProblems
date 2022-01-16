import java.util.Scanner;
public class ccc04s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] points = new int[n];
		int[] Worst = new int[n];
		for(int r=0;r<k;r++){

		for(int i=0;i<n;i++){
			int score = sc.nextInt();
			points[i]=points[i]+score;

			
		}
		
		
		for(int j=0;j<n;j++){
			int rank=1;
			for(int c=0;c<n;c++){
				if(points[j]<points[c]&&j!=c){
					rank++;
				}
			}
			if (Worst[j]<rank){
				Worst[j]=rank;
			}
		}}
		int index=0;
int max = points[0];
for (int i=1;i<n;i++){
	if(max<points[i]){
		max = points[i];
		index = i;
	}
}
for (int i=0;i<n;i++){
	if(points[i]==max){
		System.out.println("Yodeller "+ (i+1)+" is the TopYodeller: score "+ points[i]+", worst rank " +Worst[i]);

	}
}

	}

}
