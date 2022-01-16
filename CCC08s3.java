import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;
public class CCC08s3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] all = new int[11];

		for (int t=0;t<test;t++){
		int r = sc.nextInt();
		int c = sc.nextInt();

		char[][] maze = new char[r][c];
		for(int R=0;R<r;R++){
			maze[R] = sc.next().toCharArray();    //converts the entire string into separate chars 
			//into the array

		}
		int[][] step = new int[r][c];
		for (int R=0;R<r;R++){
			Arrays.fill(step[R],  Integer.MAX_VALUE);
		}
		LinkedList<Integer> rQ = new LinkedList<Integer>();
		LinkedList<Integer> cQ = new LinkedList<Integer>();
		//initialize the first location
		rQ.add(0);
		cQ.add(0);
		step[0][0] = 1;
		while(!rQ.isEmpty()){
			int R = rQ.poll();
			int C = cQ.poll();
			//get neighbors
			if (maze[R][C] == '+'||maze[R][C] =='|'){
				//2 neighbor up and down
				if (R-1>=0 &&maze[R-1][C]!='*'&&  step[R-1][C]>step[R][C]+1){
					step[R-1][C] = step[R][C]+1;
					rQ.add(R-1);
					cQ.add(C);
				}
				if (R+1<r &&maze[R+1][C]!='*'&&  step[R+1][C]>step[R][C]+1){
					step[R+1][C] = step[R][C]+1;
					rQ.add(R+1);
					cQ.add(C);
				}


			}

			if (maze[R][C] == '+'||maze[R][C] =='-'){
				//2 neighbor left and right
				if (C-1>=0 && maze[R][C-1]!='*' && step[R][C-1]>step[R][C]+1){
					step[R][C-1] = step[R][C]+1;
					rQ.add(R);
					cQ.add(C-1);
				}
				if (C+1<c &&maze[R][C+1]!='*'&&  step[R][C+1]>step[R][C]+1){
					step[R][C+1] = step[R][C]+1;
					rQ.add(R);
					cQ.add(C+1);
				}
			}


		}
		if(step[r-1][c-1]==Integer.MAX_VALUE){
		all[t] = -1;
		}else{
		    all[t] = step[r-1][c-1];

		}
		}
		
for (int p=0; p<test;p++){
	System.out.println(all[p]);
}
			
		
		}
	}

