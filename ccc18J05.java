import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
public class ccc18J05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V  = sc.nextInt();
		boolean[][] book = new boolean[V][V];
		boolean[] endingPage = new boolean[V];
		//input V number of inputs
		for (int i=0; i<V;i++){
			int M = sc.nextInt(); //how many pages for page i
			if (M==0){
				endingPage[i] = true;
			}
			for (int a=0;a<M;a++){
				int nextPage = sc.nextInt()-1;
				book[i][nextPage]=true;

			}
		}
		int[] step = new int[V];
		Arrays.fill(step, Integer.MAX_VALUE);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		step[0] = 1; // because start at page 1
		queue.add(0);
		while(!queue.isEmpty()){
			int cur = queue.poll();
			for ( int c=0; c<V;c++){
				if (book[cur][c]=true && step[c]>step[cur]+1){
					step[c]=step[cur]+1;
					queue.add(c);
				}
			}
		}
		boolean reached = true;
		//check if all the pages have been reached
		//check if the min step value of all the ending page
		int min = Integer.MAX_VALUE;
		for(int i=0;i<V;i++){
			if (step[i]==Integer.MAX_VALUE){
				reached = false;
			}
			if (endingPage[i] && min>step[i]){
				min = step[i];
			}
		}
		if (reached){
			System.out.println("Y");

		}else{
			System.out.println("N");
		}
		System.out.println(min);

	}
}
