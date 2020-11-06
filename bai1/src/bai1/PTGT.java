package bai1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class PTGT {
static String Hangsx;
static String Tenxe;
static String Namsx;
static String Sotien;
static String Mau;
static Scanner scanner = new Scanner(System.in);
	public String getHangsx()
	{
		return Hangsx;
	}
	public void setHangsx(String Hangsx)
	{
		this.Hangsx=Hangsx;
	}
	public String getNamsx()
	{
		return Namsx;
	}
	public void setNamsx(String Namsx)
	{
		this.Namsx=Namsx;
	}
	public String getSotien()
	{
		return Sotien;
	}
	public void setSotien(String Sotien)
	{
		this.Sotien=Sotien;
	}
	public String getMau()
	{
		return Mau;
	}
	public void setMau(String Mau)
	{
		this.Mau=Mau;
	}
	public void PTGT()
	{
		this.Hangsx=Hangsx;
		this.Namsx=Namsx;
		this.Sotien=Sotien;
		this.Mau=Mau;
	}
	public void nhap()
	{
		System.out.print("nhap hang san xuat");
		Hangsx=scanner.nextLine();
		System.out.print("nhap nam san xuat");
		Namsx=scanner.nextLine();
		System.out.print("nhap so tien");
		Sotien=scanner.nextLine();
		System.out.print("nhap mau");
		Mau=scanner.nextLine();
	}
	public String in()
	{
		return "hang san xuat " + this.Hangsx + " nam san xuat "+this.Namsx+" so tien "+this.Sotien+" mau "+this.Mau;
	
	}

}
