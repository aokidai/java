package bth1;

public class XeMay extends PTGT {
static String Congxuat;
	
	public String getCongxuat()
	{
		return Congxuat;
	}
	public void setCongxuat(String Congxuat)
	{
		this.Congxuat=Congxuat;
	}
	
	public void XeTai()
	{
		this.Congxuat=Congxuat;
	}
	public void nhapxemay()
	{
		nhap();
		System.out.print("nhap cong xuat");
		Congxuat = scanner.nextLine();
	}
	public String inxemay()
	{
		in();
		return "Cong xuat xe " + this.Congxuat;
	}
}
