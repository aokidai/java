package bai1;

public class XeTai extends PTGT{
	static String Trongtai;
	
	public String getTrongtai()
	{
		return Trongtai;
	}
	public void setTrongtai(String Trongtai)
	{
		this.Trongtai=Trongtai;
	}
	
	public void XeTai()
	{
		this.Trongtai=Trongtai;
	}
	public void nhapxetai()
	{
		nhap();
		System.out.print("nhap cong xuat");
		Trongtai = scanner.nextLine();
	}
	public String inxetai()
	{
		in();
		return "Cong xuat xe " + this.Trongtai;
	}
	public boolean contains(String timmau) {
		// TODO Auto-generated method stub
		return false;
	}
}
