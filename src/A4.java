
public class A4 implements Araba, Guvenlik {
	
	String renk;
	int koltukSayisi;
	double motorHacmi;
	String yakitTuru;
	int fiyat;
	boolean sunroof;
	boolean hizSabitleyici;
	double lastikCapi;
	
	
	
	public void boya(String renk) {
		
		this.renk=renk;
	}
	public void setKoltukSayisi() {
		
		this.koltukSayisi=5;
	}
	public void setMotorHacmi() {
		
		this.motorHacmi=2.0;
	}
	public void setYakitTuru(String yakitTuru) {
		
		this.yakitTuru=yakitTuru;
	}
	
	public boolean testEt() {
		
		System.out.println("100km tet surusu yapildi");
		
		return true;
	}
	
	public void satisFiyatiBelirle() {
		
		this.fiyat=1000;
		
	}
	
	public void sunroof() {
		
		this.sunroof=true;
		this.fiyat+=50;
		
		
	}
	
	public void setLastikcapi(double cap) {
		
		this.lastikCapi=cap;
		
	}
	
	
	public void hizSabitleyici(boolean isteniyorMu) {
		
		if(isteniyorMu) {
		this.hizSabitleyici=true;
		this.fiyat+=10;
		}
		else
			this.hizSabitleyici=false;
		}
	
	public void seritTakip() {
		
	}
	
	public void parkSensoru(){
		
	}
	public void yolcuAirbag() {
		
	}
	public void	soforAirbag() {
		
	}
	public void yokusDestek() {
		
	}
	
	
public static void main(String[] arg) {
		
		
	}




}
