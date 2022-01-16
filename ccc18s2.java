import java.util.*;
public class ccc18s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		for(int r=0;r<N;r++){
			for(int c=0;c<N;c++){
				map[r][c]=sc.nextInt();		
			}

		}
		int ac=0;
		int ar=0;

		if(map[ar][ac]>map[0][N-1]){

		}else{
			ac=N-1;
			ar=0;
		}if(map[ar][ac]>map[N-1][N-1]){

		}else{
			ac=N-1;
			ar=N-1;
		}if(map[ar][ac]>map[N-1][0]){

		}else{
			ac=0;
			ar=N-1;
		}if(N==1){
			System.out.print(map[0][0]);
		}else if(ac==N-1&&ar==N-1){
			for(int r=0;r<N;r++){
				for(int c=0;c<N;c++){
					System.out.print(map[r][c]+" ");			
				}
				System.out.println();

			}
		}else if(ac==0&&ar==0){
			for(int r=N-1;r>=0;r--){
				for(int c=N-1;c>=0;c--){
					System.out.print(map[r][c]+" ");			
				}
				System.out.println();

			}
		}else if(ac==0&&ar==N-1){
			for(int c=N-1;c>=0;c--){
				for(int r=0;r<N;r++){
					System.out.print(map[r][c]+" ");			
				}			System.out.println();


			}
		}else if(ac==N-1&&ar==0){
			for(int c=0;c<N;c++){
				for(int r=N-1;r>=0;r--){
					System.out.print(map[r][c]+" ");			
				}			System.out.println();


			}
			
		}

	}

}
//1 2 3
//4 5 6
//7 8 9