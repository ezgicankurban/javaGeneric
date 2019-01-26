package collect.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Runner {

	public static void main(String[] args) {
		
		Map<Integer, String> iller= new HashMap<Integer,String>();
		iller.put(1, "Adana");
		iller.put(2, "Adýyaman");
		iller.put(3, "Afyon");
		iller.put(4, "Salla");
		iller.put(5, "Amasya");
		iller.put(6, "Ankara");
		iller.put(34, "Ýstanbul");
		iller.put(8, "Çanakkale");
		//System.out.println(iller);
		//while(iller.) iterator özellði olmadýðý için whileile yazýlamaz.
		for (Entry<Integer, String> temp  : iller.entrySet()) {
			System.out.println(temp.getKey()+ "-" +temp.getValue());
			
		}
		
		
		
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
			//System.out.println(it.next());
			
			
			
		}

	}

}
