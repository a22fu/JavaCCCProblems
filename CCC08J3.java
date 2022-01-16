import java.util.Scanner;
public class CCC08J3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = 0;       //the row number that you start at
		int c1 = 0;       //column number that you start at  (0,0)
		int sum = 0;      //variable for the sum of the distances travelled
		char a[][] = {{'A','B','C','D','E','F'},
				{'G','H','I','J','K','L'},
				{'M','N','O','P','Q','R'},
				{'S','T','U','V','W','X'},
				{'Y','Z',' ','-','.','*'}}; //2d array for the keyboard, * represents enter
		String input = sc.nextLine()+'*';    //input a string. * at the end to indicate hitting enter

		for (int i=0;i<input.length();i++){   //for loop that loops for every letter in the string
			char b = input.charAt(i);         //b is the letter that it needs to find.
			//b goes through the entire string
			for  (int c=0;c<6;c++){
				for (int r=0;r<5;r++){     //for loops that searches the entire array for b
					if (b==a[r][c]){       //when it finds b in the array

						sum = sum+ Math.abs(r-r1)+Math.abs(c-c1);	 //find the difference between the initial and the final points
						r1 = r;   //your 'new initial' position is now r,c
						c1 = c;				
					}
				}
			}
		}    	 System.out.println(sum);  //at the end output the sum
	}	
}