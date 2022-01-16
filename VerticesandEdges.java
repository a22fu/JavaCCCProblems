import java.util.LinkedList;
import java.util.Scanner;
public class VerticesandEdges {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 0;i<7;i++){
			queue.add(sc.nextInt());



		}
		for (int i = 0;i<7;i++){
			System.out.println(queue.poll());			


		}
		



		Boolean[][] map = new Boolean[5][5];
		map[0][1] = true;
		map[1][0] = true;
		map[0][3] = true;
		map[3][0] = true;
		map[0][4] = true;
		map[4][0] = true;
		map[1][3] = true;
		map[3][1] = true;
		map[3][4] = true;
		map[4][3] = true;
		map[1][2] = true;
		map[2][1] = true;
		map[2][3] = true;
		map[3][2] = true;


	}
}