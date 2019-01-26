package ArabaSiralama;

public class Araba implements Siralanabilir {
	
	private int model;
	private String marka;
	
	public Araba(int model,String marka) {
		this.marka=marka;
		this.model=model;
	}
	
	
		public int getModel() {
		return model;
	}



	public void setModel(int model) {
		this.model = model;
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



		@Override
		public int karsilastir(Object temp) {
			
			Araba c=(Araba) temp;
			if(this.model>c.model) {
				return -1;
				
			}else if(this.model<c.model)
				return 1;
			else
				return 0;
			
		
		}
		
		@Override
		public String toString() {
			
			String temp=getMarka();
			
			for (int i = 0; i <20-getMarka().length(); i++) {
				temp=temp +" ";
			}
			
			return temp +":" +getModel();
		}


		@Override
		public String veriYaz() {
			// TODO Auto-generated method stub
			return null;
		}
		
	
}
