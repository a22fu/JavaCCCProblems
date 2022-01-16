import java.util.LinkedList;

public class Practice2 {
	public static void main(String[] args) {
	//Create a linked list to store apple and banana,
	//output the first item from the linkedlist
	LinkedList<String> queue = new LinkedList<String>();
	queue.add("Apple");
	queue.add("Banana");
	System.out.println(queue.poll());

boolean[][] map = new boolean[4][4];
map[0][1] = true;
map[1][0] = true;
map[0][3] = true;
map[3][0] = true;
map[1][2] = true;
map[2][1] = true;
map[2][3] = true;
map[3][2] = true;
	}
}
