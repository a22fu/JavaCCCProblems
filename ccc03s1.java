import java.util.Scanner;

public class ccc03s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int move = 1;

int square = 1;
while(true){
	move = sc.nextInt();
	if(move==0){
		break;
	}
	if(square+move<=100){
	square = square+move;
	}
if(square==54){
	square =19;
}else if(square==90){
	square =48;
}else if(square==99){
	square =77;
}else if(square==9){
	square = 34;
}else if(square==40){
	square = 64;
}else if(square==67){
	square = 86;
}else if(square==100){
break;
}

System.out.println("You are now on square "+square);
	}
if (square==100){
	System.out.println("You are now on square "+100);

	System.out.println("You Win!");
}else{

	System.out.println("You Quit!");

}

}
}
