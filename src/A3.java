
public class A3 implements Araba {
	public static final double LastikCapi=17;	
	String renk;
	int koltukSayisi;
	double motorHacmi;
	String yakitTuru;
	int fiyat;
	boolean hizSabitleyici;
	
	
	public void boya(String renk) {
		
		this.renk=renk;
	}
	public void setKoltukSayisi() {
		
		this.koltukSayisi=4;
	}
	public void setMotorHacmi() {
		
		this.motorHacmi=1.6;
	}
	public void setYakitTuru(String yakitTuru) {
		
		this.yakitTuru=yakitTuru;
	}
	
public boolean testEt() {
		
		System.out.println("80 km tet surusu yapildi");
		
		return true;}

public void satisFiyatiBelirle() {
	
	this.fiyat=800;
	
}
	public void hizSabitleyici(boolean isteniyorMu) {
	
	if(isteniyorMu) {
	this.hizSabitleyici=true;
	this.fiyat+=8;
	}
	else
		this.hizSabitleyici=false;
	}


	public static void main(String[] arg) {
		
		
	}

}
