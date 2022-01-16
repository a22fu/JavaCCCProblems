import java.util.*;
public class ccc09j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String action = "";
		int a = 0;
		int b = 0;
		ArrayList<Integer> friends[] = new ArrayList[51];
		for(int i = 1; i < 51; i++){
			friends[i] = new ArrayList<Integer>();
		}friends[2].add(6);
		friends[6].add(2);
		friends[1].add(6);
		friends[6].add(1);
		friends[6].add(7);
		friends[7].add(6);
		friends[5].add(6);
		friends[6].add(5);
		friends[4].add(6);
		friends[6].add(4);
		friends[3].add(6);
		friends[6].add(3);
		friends[3].add(4);
		friends[4].add(3);
		friends[4].add(5);
		friends[5].add(4);
		friends[5].add(3);
		friends[3].add(5);
		friends[7].add(8);
		friends[8].add(7);
		friends[8].add(9);
		friends[9].add(8);
		friends[9].add(10);
		friends[10].add(9);
		friends[10].add(11);
		friends[11].add(10);
		friends[11].add(12);
		friends[12].add(11);
		friends[9].add(12);
		friends[12].add(9);
		friends[3].add(15);
		friends[15].add(3);
		friends[12].add(13);
		friends[13].add(12);
		friends[13].add(15);
		friends[15].add(13);
		friends[13].add(14);
		friends[14].add(13);
		friends[16].add(17);
		friends[17].add(16);
		friends[16].add(18);
		friends[18].add(16);
		friends[17].add(18);
		friends[18].add(17);
		while(true){
			action = sc.next();
			if(action.equals("q")){
				break;
			}if(action.equals("i")){
				a = sc.nextInt();
				b = sc.nextInt();
				if(!friends[a].contains(b)){
					friends[a].add(b);
					friends[b].add(a);
				}
			}if(action.equals("d")){
				a = sc.nextInt();
				b = sc.nextInt();
				friends[a].remove(friends[a].get(b));
				friends[b].remove(friends[b].get(a));
			}if(action.equals("n")){
				a = sc.nextInt();
				System.out.println(friends[a].size());
			}if(action.equals("f")){
				a = sc.nextInt();
				int counter = 0;
				ArrayList<Integer> countedFriends = new ArrayList<Integer>();
				for(int i = 0; i < friends[a].size(); i++){
					int currFriend = friends[a].get(i);
					for(int j = 0; j < friends[currFriend].size(); j++){
						if(!friends[a].contains(friends[currFriend].get(j))&&!countedFriends.contains(friends[currFriend].get(j))&&friends[currFriend].get(j)!=a){
							counter++;
							countedFriends.add(friends[currFriend].get(j));
						}
					}
				}System.out.println(counter);
			}if(action.equals("s")){
				a = sc.nextInt();
				b = sc.nextInt();
				boolean visited[] = new boolean[51];
				int dist[] = new int[51];
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(a);
				while(!q.isEmpty()){
					int curr = (int) q.poll();
					for(int i = 0; i < friends[curr].size(); i++){
						int currFriend = friends[curr].get(i);
						if(visited[currFriend]==false){
							q.add(currFriend);
							dist[currFriend] = dist[curr]+1;
							visited[currFriend] = true;
						}
					}
				}System.out.println(dist[b]);
			}
		}
	}

}
