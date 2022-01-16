import java.util.*;
public class ccc05j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int R = sc.nextInt();
		int cc = sc.nextInt();
		int cr = sc.nextInt();
		int N = sc.nextInt();
		boolean[][] map = new boolean[R][C];

		for(int r=0;r<R;r++){
			for(int c=0;c<C;c++){
				if((r<cr && c<cc) || (r<cr && c>=C-cc)|| (r>=R-cr && c>=C-cc)|| (r>=R-cr && c<cc)){
					map[r][c]=false;

				}else{
					map[r][c]=true;
				}
			}
		}
		int c= cc;
		int r = 0;
		int direction=90;
		int count=0;

		while(true){
			if(count==N){
				break;
			}

			if(direction==90){

				if(r-1>=0&&map[r-1][c]==true){
					map[r][c]=false;				
					direction=0;
					r=r-1;
					count++;
				}else if(c+1<C&&map[r][c+1]==true){
					map[r][c]=false;				
					direction=90;
					c=c+1;
					count++;

				}else if(c+1<C&&map[r][c+1]==false||c+1>=C){
					map[r][c]=false;				
					direction=180;
					r=r+1;
					count++;

				}
			}

			if(direction==180){

				if(c+1<C&&map[r][c+1]==true){
					map[r][c]=false;				
					direction=90;
					c=c+1;
					count++;

				}else if(r+1<R&&map[r+1][c]==true){
					map[r][c]=false;				
					direction=180;
					r=r+1;
					count++;

				}else if(r+1<R&&map[r+1][c]==false||r+1>=R){
					map[r][c]=false;				
					direction=270;
					c=c-1;
					count++;
				}

			}
			if(direction==270){

				if(r+1<R&&map[r+1][c]==true){
					map[r][c]=false;				
					direction=180;
					r=r+1;
					count++;

				}else if(c-1>=0&&map[r][c-1]==true){
					map[r][c]=false;				
					direction=270;
					c=c-1;
					count++;

				}else if(c-1>=0&&map[r][c-1]==false||c-1<0){
					map[r][c]=false;				
					direction=0;
					r=r-1;
					count++;

				}
			}
			if(direction==0){

				if(c-1>=0&&map[r][c-1]==true){
					map[r][c]=false;				
					direction=270;
					c=c-1;
					count++;

				}else if(r-1>=0&&map[r-1][c]==true){
					map[r][c]=false;				
					direction=0;
					r=r-1;
					count++;

				}else if(r-1>=0&&map[r-1][c]==false||r-1<0){
					map[r][c]=false;				
					direction=90;
					c=c+1;
					count++;


				}
			}
		}				System.out.println(r+1);
		System.out.print(c+1);



	} 
}

