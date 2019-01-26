package ArabaSiralama;

public class Canta implements Siralanabilir {
	
	private int fiyat;
	private String marka;
	
	public Canta(int fiyat,String marka) {
		this.marka=marka;
		this.fiyat=fiyat;
	}
	
	
	public int getFiyat() {
		return fiyat;
	}


	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}


	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	@Override
	public int karsilastir(Object temp) {
		Canta c=(Canta) temp;
		if(this.fiyat >c.fiyat) {
			return -1;
			
		}else if(this.fiyat<c.fiyat)
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
		
		return temp +":" +getFiyat();
	}


	@Override
	public String veriYaz() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
