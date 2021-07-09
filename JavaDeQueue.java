
import java.util.*;

public class JavaDeQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new LinkedList<Integer>();
		HashSet<Integer> set = new HashSet<>();
		
		int n= sc.nextInt();
		int m= sc.nextInt();
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			int ip=sc.nextInt();
			
			deque.add(ip);
			set.add(ip);
			
			if(deque.size()==m) {
				if(set.size()>max)
					max = set.size();
				
				int first =(int) deque.remove();
				if(!deque.contains(first))
					set.remove(first);
			}
		}
		System.out.println(max);
		
	}

}