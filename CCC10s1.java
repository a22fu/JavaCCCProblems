import java.util.Scanner;
public class CCC10s1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int countt = 0;
        int counts = 0;
        for (int i=0; i<T;i++){
            String s1= sc.nextLine();

            for (int c = 0; c< s1.length(); c++ ){
                if(s1.charAt(c)=='T'||s1.charAt(c)=='t'){
                    countt++;
                }if(s1.charAt(c)=='S'||s1.charAt(c)=='s'){
                    counts++;
                }

            }

        }
        if (counts!=0&&countt!=0&&counts>=countt){
            System.out.println("French");
        }else{
            System.out.println("English");
        }
    }

}