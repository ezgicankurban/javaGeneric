package collect.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		
		Map<K, V>
		Set<Integer> liste = new HashSet<Integer>();
		liste.add(3);
		liste.add(5);
		liste.add(4);
		liste.add(7);
		liste.add(9);
		liste.add(18);
		liste.add(13);
		liste.add(16);
		liste.add(17);
		
		/*for (Integer temp : liste) {
			System.out.println(temp);
		}*/
		
	
		
		Iterator it= liste.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			
			
		}

	}

}
