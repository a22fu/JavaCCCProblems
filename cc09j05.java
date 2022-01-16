import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class cc09j05 {
	public static void main(String[] args) {
		//input 6 edges
		//bv and ev
		//Store into 2D boolean array
		int V = 51;
		Scanner sc = new Scanner(System.in);
		boolean[][] map = new boolean[V][V];
		int[] step = new int[V];

		map[1][6] = true;
		map[6][1] = true;
		map[2][6] = true;
		map[6][2] = true;
		map[3][4] = true;
		map[4][3] = true;
		map[3][5] = true;
		map[5][3] = true;
		map[3][6] = true;
		map[6][3] = true;
		map[3][15] = true;
		map[15][3] = true;
		map[4][5] = true;
		map[5][4] = true;
		map[4][6] = true;
		map[6][4] = true;
		map[6][7] = true;
		map[7][6] = true;
		map[7][8] = true;
		map[8][7] = true;
		map[8][9] = true;
		map[9][8] = true;
		map[9][10] = true;
		map[10][9] = true;
		map[9][12] = true;
		map[12][9] = true;
		map[10][11] = true;
		map[11][10] = true;
		map[11][12] = true;
		map[12][11] = true;
		map[12][13] = true;
		map[13][12] = true;
		map[13][14] = true;
		map[14][13] = true;
		map[13][15] = true;
		map[15][13] = true;
		map[16][17] = true;
		map[17][16] = true;
		map[17][18] = true;
		map[18][17] = true;
		map[16][18] = true;
		map[18][16] = true;

		String q = "";

		int x;
		int y;
		int count=0;

		while(!q.equals("q")){
		q = sc.nextLine();
			if (q=="i"){
				x = sc.nextInt();
				y = sc.nextInt();
				map[x][y] = true;
				map[y][x] = true;
			}else if (q.equals("d")){
				x = sc.nextInt();
				y = sc.nextInt();
				map[x][y] = false;
				map[y][x] = false;
			}else if (q.equals("n")){
				x = sc.nextInt();
				for(int i=0; i<51;i++){
					if (map[x][i]==true){
						count++;
					}
				}
				System.out.println(count);
				count = 0;
			}else if (q.equals("f")){
				x = sc.nextInt();
				for(int i=0; i<51;i++){
					if (map[x][i]==true){
						for (int c = 0;c<51;c++){
							if (map[c][i]==true&&map[x][c]==false){
								count++;
							}
						}
					}
				}
				System.out.println(count);
				count = 0;
			}else if (q.equals("s")){
				x = sc.nextInt();
				y = sc.nextInt();
				//Create the key data structure -- step   queue
				Arrays.fill(step, Integer.MAX_VALUE);
				//Create a queue
				LinkedList<Integer> queue = new LinkedList<Integer>();

				//Initialize the beginning
				step[x] = 0;
				queue.add(0);
				while (!queue.isEmpty()) {
					int cur = queue.poll();    //read and remove
					//get neighbor
					for (int c=0; c<V; c++) { //c is neighbor
						if (map[cur][c]==true && step[c]>step[cur]+1) {
							step[c] = step[cur]+1;  
							//update neighbor step value to cur step value+1
							queue.add(c);   //add neighbor to queue	
						}
					}
				}
				System.out.println(step[y]);
			}



		}







	}


}