import java.util.Scanner;
import java.util.LinkedList;
public class ccc14s3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count = 1;
		LinkedList<String> out = new LinkedList<String>();
		LinkedList<Integer> m = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		for (int i=0; i<T;i++){
			int N = sc.nextInt();
			m.clear();
			b.clear();
			count=1;
			for (int c=0;c<N;c++){
				m.addFirst(sc.nextInt());
			}
			while(!m.isEmpty()&&b.isEmpty()){
				if(m.getFirst()==count){
					count++;
					m.poll();
				}
				if(m.getFirst()!=count){
					b.addFirst(m.poll());
				}
			}
			while(!b.isEmpty()){
				if(b.getFirst()==count){
					b.poll();
					count++;
				}else if(!m.isEmpty()){
					if(m.getFirst()==count){
						count++;
						m.poll();
					}else if(b.get(0)!=count&&m.get(0)!=count){
						b.addFirst(m.poll());
						
					}
				}else if(m.isEmpty()&&b.getFirst()!=count){
					break;
				}
			}


			if(b.isEmpty()&&m.isEmpty()){
				out.addLast("Y");
			}else{
				out.addLast("N");
			}

		}
		for (int i = 0;i<out.size();i++){
			System.out.println(out.get(i));
		}
	}
}
