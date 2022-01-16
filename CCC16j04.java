import java.util.Scanner;
public class CCC16j04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] startTime = sc.next().split(":");
		int h = Integer.parseInt(startTime[0]);
		int m = Integer.parseInt(startTime[1]);

		for(int i=0; i<120; i++){
			m++;
			if ((h>=7 && h<10)||(h>=15 && h<19)){
			m++;
			}
			if (m>=60){
				h++;
				m=0;
			}
			if (h>=24){
				h=0;
			}
		}
		System.out.printf("%02d:%02d",h,m);

	}

}
