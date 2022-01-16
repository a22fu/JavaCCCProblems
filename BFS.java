import java.util.LinkedList;

public class BFS {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new  LinkedList<Integer>();   //like scanner queue=name, integer=type
		System.out.println(queue.size());   //get size(number of items, default 0
		queue.add(11);                      //add 11 value. Stored into 0 value
		queue.add(9);
		queue.add(10);
		System.out.println(queue);  
		System.out.println(queue.size());  

		int N = queue.poll();                       //Remove your first item (11), N=11
		System.out.println(N);              
		System.out.println(queue);                  //[9,10]
		System.out.println(queue.size());           //2



	}
}
