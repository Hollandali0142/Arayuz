
public interface Araba {
	
	//interface te amac diger siniflara taslak hazirlamak fonksiyon yazmak icin kullanilir.
	
	
	  String marka="Audi";
	public static final double LastikCapi=17;
	public void boya(String renk);
	public void setKoltukSayisi();
	public void setMotorHacmi();
	public void setYakitTuru(String yakitTuru);
	
	public boolean testEt();
	
	public void satisFiyatiBelirle();
	
	public void hizSabitleyici(boolean isteniyorMu);
}
