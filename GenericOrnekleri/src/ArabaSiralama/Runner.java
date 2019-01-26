package ArabaSiralama;



public class Runner {

	public static void main(String[] args) {
		Araba a1=new Araba(2010,"BMW");
		Araba a2=new Araba(2020,"Mercedes");
		Araba a3=new Araba(2009,"Ford");
		Araba a4=new Araba(2002,"Cadillac");
		Araba a5=new Araba(2004,"Suzuki");
		
		Canta c1=new Canta(1000,"Chanel");
		Canta c2=new Canta(2000,"dior");
		Canta c3=new Canta(1100,"Versace");
		Canta c4=new Canta(1200,"Kanken");
		Canta c5=new Canta(100,"Zara");
	     
		
		Siralanabilir[] temp= {a1,a2,a3,a4,a5};
		sirala(temp);
		
		System.out.println("-------------------------------");

		Siralanabilir[] ctemp= {c1,c2,c3,c4,c5};
		sirala(ctemp);
	

	}
	public static  void sirala(Siralanabilir[] temp) {
		for(int i=0; i<temp.length;i++) {
			for(int j=0;j<temp.length-1-i;j++) {
				if(temp[j].karsilastir(temp[j+1])==-1) {
					Siralanabilir t=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=t;
				}
			}
		}
		
	
		for (Siralanabilir siralanabilir : temp) {
			System.out.println(siralanabilir.toString());
			
		}
		
		
	}

}
