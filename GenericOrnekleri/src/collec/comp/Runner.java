package collec.comp;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;



public class Runner {

	public static void main(String[] args) {
		List liste=new ArrayList();
		
		liste.add("Ezgi");
		liste.add("Fehime");
		liste.add("Mustafa");
		liste.add("Ünzile");
		liste.add("Ýhsan");
		liste.add("Çetin");
		
		
		Collator tr=Collator.getInstance(new Locale("TR","TR"));
		Collections.sort(liste,tr);
		System.out.println(liste);
		
		
			
	}

}
