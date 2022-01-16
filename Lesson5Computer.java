import java.util.Arrays;
import java.util.Scanner;
public class Lesson5Computer {
	//Class has no template
	//WHen you create a class, you need to provide data

	public static class Computer implements Comparable<Computer>{
		//Data member
		String name;
		int R;
		int S;
		int D;
		int value;

		//Constructor
		public Computer(String name, int R, int S, int D){
			this.name = name;
			this.R = R;
		
			this.S = S;
			this.D = D;
			this.value = 2*R+3*D+S;
		}

		@Override
		public int compareTo(Computer o) {
			if (this.value>o.value){
				return 1;
			}else if(this.value<o.value){
				return -1;
			}else{
				return -this.name.compareTo(o.name);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Computer[] computer = new Computer[n];
		for (int i =0;i<n;i++){
			String name = sc.next();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int D = sc.nextInt();
			computer[i] = new Computer(name,R,S,D);
		}
		Arrays.sort(computer);
		System.out.println(computer[n-1].name);
		System.out.println(computer[n-2].name);
	}

}
