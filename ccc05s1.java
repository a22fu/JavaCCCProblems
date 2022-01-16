import java.util.*;
import java.util.Arrays;

public class ccc05s1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s2="";

		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		map.put('A', 2);
		map.put('B', 2);
		map.put('C', 2);
		map.put('D', 3);
		map.put('E', 3);
		map.put('F', 3);
		map.put('G', 4);
		map.put('H', 4);
		map.put('I', 4);
		map.put('J', 5);
		map.put('K', 5);
		map.put('L', 5);
		map.put('M', 6);
		map.put('N', 6);
		map.put('O', 6);
		map.put('P', 7);
		map.put('Q', 7);
		map.put('R', 7);
		map.put('S', 7);
		map.put('T', 8);
		map.put('U', 8);
		map.put('V', 8);
		map.put('W', 9);
		map.put('X', 9);
		map.put('Y', 9);
		map.put('Z', 9);
		for(int i =0;i<N;i++){
			s2="";
			String s =sc.nextLine();
			s.replaceAll("-", "");
			for(int c=0;c<s.length();c++){
				if(map.containsKey(s.charAt(c))){
					s2 += map.get(s.charAt(c));
				} else {
					s2 += s.charAt(c);
				}
			
			}
			s2 = s2.substring(0,3)+'-'+s2.substring(3,6)+'-'+s2.substring(6,10);
			System.out.println(s2);
		}

}
}
