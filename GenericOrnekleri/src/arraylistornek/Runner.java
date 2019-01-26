package arraylistornek;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List liste=new ArrayList();
		List yeniliste= new YeniListe();
		
		List liste2=new ArrayList();
		liste.add("Ezgi");
		liste.add("Fehime");
		liste.add(3);
		liste.add(3.14);
		float pi=3.142f;
		liste.add(pi);
		liste.add(10-000-000-000L);
		yeniliste.add("Deneme");
		liste.add(yeniliste);
		//int a=(int)liste.get(0);
		for(Object temp: liste) {
			System.out.println(temp.toString());
			}
		
	   for (int i = 0; i < yeniliste.size()/2; i++) {
		   int temp;
		  
		   temp=liste.get(liste2.size(i));
		   liste.get(i,size(temp))
		   
		   
		  
				   
		
	}
	   
		
		

	}

}
