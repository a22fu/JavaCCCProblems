import java.util.Scanner;
public class CCC08s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] city = new String[10000];
		int[] temperature = new int[10000];
		String cit = "";
		int temp =0;
		int austin = 0;
		do{
			cit = sc.next();
			temp = sc.nextInt();
			temperature[austin] = temp;
			city[austin] = cit;
			austin++;
		} while (cit != "Waterloo");
		

		for(int i=0;i<=austin;i++){
			if(temperature[i]<temp){
				temp = temperature[i];
				cit = city[i];
			}
		}


		System.out.print(cit);
	}
}

