import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
public class ccc18s3 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char[][] map = new char[R][C];
		for (int r = 0; r<R;r++){
			map[r] = sc.next().toCharArray();
		}
		int[][] step = new int[R][C];
		for (int r=0;r<R;r++){
			Arrays.fill(step[r],  Integer.MAX_VALUE);
		}
		LinkedList<Integer> rQ = new LinkedList<Integer>();
		LinkedList<Integer> cQ = new LinkedList<Integer>();
		int Br=0;
		int Bc=0;

		for (int r=0;r<R;r++){
			for (int c=0;c<C;c++){
				if (map[r][c]=='S'){
					step[r][c] = 0;
					Br=r;
					Bc=c;
				}
			}
		}
		step[Br][Bc] = 0;
		rQ.add(Br);
		cQ.add(Bc);

		while(!rQ.isEmpty()){
			int r = rQ.poll();
			int c = cQ.poll();
			//maximum
			//up down left right
			if(r-1>=0 && map[r-1][c]!='W'&&step[r-1][c]>step[r][c]+1||map[r-1][c]=='U'){
				step[r-1][c] = step[r][c]+1;
				rQ.add(r-1);
				cQ.add(c);
			}
			if(r+1<R && map[r+1][c]!='W'&&step[r+1][c]>step[r][c]+1){
				step[r+1][c] = step[r][c]+1;
				rQ.add(r+1);
				cQ.add(c);
			}
			if(c-1>=0 && map[r][c-1]!='W'&&step[r][c-1]>step[r][c]+1){
				step[r][c-1] = step[r][c]+1;
				rQ.add(r);
				cQ.add(c-1);
			}
			if(c+1<C && map[r][c+1]!='W'&&step[r][c+1]>step[r][c]+1){
				step[r][c+1] = step[r][c]+1;
				rQ.add(r);
				cQ.add(c+1);
			}



		}for(int c=0;c<C;c++){
			for(int r=0;r<R;r++){
				if(map[r][c]=='.'){
					if(step[r][c]==Integer.MAX_VALUE){
						System.out.println("-1");
					}else{
						System.out.println(step[r][c]);

					}
				}
			}




		}
	}
}


