import java.util.*;
public class ccc18j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		boolean[][] map = new boolean[V][V];
		for (int i=0;i<E;i++){
				int bv = sc.nextInt();
				int ev = sc.nextInt();
			map[bv][ev] = true;
			map[ev][bv] = true;

		}
		int[] step = new int[V];
		
	}

}
