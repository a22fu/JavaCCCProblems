
import java.util.Arrays;
import java.util.Scanner;
public class CCC11j4 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean safe = true;
		int magnitude;
		String direction;
		char directionc;
		int y = 4;
		int x = 199;
		int n = -1;


		Boolean v[][] = new Boolean[200][401];
		int a[] = new int[100000];
		int b[] = new int[100000];

		for(int r=0; r<200;r++){
			for(int c=0; c<401;c++){
				v[r][c] = false;
			}
		}
		v[0][200] = true;
		v[1][200] = true;
		v[2][200] = true;
		v[2][201] = true;
		v[2][202] = true;
		v[2][203] = true;
		v[3][203] = true;
		v[4][203] = true;
		v[4][204] = true;
		v[4][205] = true;
		v[3][205] = true;
		v[2][205] = true;
		v[2][206] = true;
		v[2][207] = true;
		v[3][207] = true;
		v[4][207] = true;
		v[5][207] = true;
		v[6][207] = true;
		v[6][206] = true;
		v[6][205] = true;
		v[6][204] = true;
		v[6][203] = true;
		v[6][202] = true;
		v[6][201] = true;
		v[6][200] = true;
		v[6][199] = true;
		v[5][199] = true;
		v[4][199] = true;
		do{
			direction = sc.next();
			magnitude = sc.nextInt();
			directionc = direction.charAt(0);
			if (directionc == 'd'){
				v[y][x]=false;
				n++;
				b[n] = x;
				a[n] = y+magnitude;

				for (int i=0;i<magnitude+1;i++){

					if (v[y+i][x]==true){

						safe = false;
					}else if(v[y+i][x]==false){
						v[y+i][x]=true;


					}

				}	y = y+magnitude;
			}else if(directionc == 'u'){
				v[y][x]=false;
				n++;
				b[n] = x;
				a[n] = y-magnitude;
				for (int i=0;i<magnitude+1;i++){

					if (v[y-i][x]==true){

						safe = false;
					}else if(v[y-i][x]==false){
						v[y-i][x]=true;


					}
				}	y = y-magnitude;

			}else if(directionc == 'l'){
				v[y][x]=false;
				n++;
				b[n] = x-magnitude;
				a[n] = y;
				for (int i=0;i<magnitude+1;i++){

					if (v[y][x-i]==true){

						safe = false;
					}else if(v[y][x-i]==false){
						v[y][x-i]=true;


					}
				}	x = x-magnitude;

			}else if (directionc == 'r'){
				v[y][x]=false;
				n++;
				b[n] = x+magnitude;
				a[n] = y;
				for (int i=0;i<magnitude+1;i++){

					if (v[y][x+i]==true){

						safe = false;
					}else if(v[y][x+i]==false){
						v[y][x+i]=true;


					}	
				}	

				x = x+magnitude;} 
		}while(directionc!='q'&&safe==true);

		for (int i=0; i<n;i++){
			System.out.println((b[i]-200)+" "+(-a[i]-1)+" safe");

		}if (safe==false){
			System.out.println((b[n]-200)+" "+(-a[n]-1)+" DANGER");
		}else {
			System.out.println((b[n]-200)+" "+(-a[n]-1)+" safe");

		}





	}
}
