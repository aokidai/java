package bai1;

public class Oto extends PTGT{
	static String Socho;
	static String Kieudc;
	public String getSocho()
	{
		return Socho;
	}
	public void setSocho(String Socho)
	{
		this.Socho=Socho;
	}
	public String getKieudc()
	{
		return Kieudc;
	}
	public void setKieudc(String Kieudc)
	{
		this.Kieudc=Kieudc;
	}
	public void Oto()
	{
		this.Socho=Socho;
		this.Kieudc=Kieudc;
	}
	public void nhapoto()
	{
		nhap();
		System.out.print("nhap so cho ngoi");
		Socho=scanner.nextLine();
		System.out.print("nhap kieu dong co");
		Kieudc=scanner.nextLine();
	}
	public String inoto()
	{
		in();
		return "So cho ngoi " + this.Socho+" kieu dong co "+this.Kieudc;
	}
}
