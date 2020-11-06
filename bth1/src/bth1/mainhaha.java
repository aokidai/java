package bth1;

import java.util.ArrayList;
import java.util.Scanner;

public class mainhaha {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList <PTGT> arrXe =new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("1.nhap oto\n2.nhap xe may \n3.nhap xe tai\n4.tim xe theo mau");
			ch = scanner.nextInt();
			switch(ch)
			{
			case 1:
				{
				System.out.print("nhap thong tin oto\n");
				Oto oto=new Oto();
				oto.nhapoto();
				arrXe.add(oto);
				break;
				}
			case 2:
			{
			System.out.print("nhap thong tin xe may\n");
			XeMay xemay=new XeMay();
			xemay.nhapxemay();
			arrXe.add(xemay);
			break;
			}
			case 3:
			{
			System.out.print("nhap thong tin xe tai\n");
			XeTai xetai=new XeTai();
			xetai.nhapxetai();
			arrXe.add(xetai);
			break;
			}
			case 4:
			{
				String timmau;
				Scanner scanner = new Scanner(System.in);
				System.out.print("nhap mau can tim");
				timmau=scanner.nextLine();
				for(PTGT xe: arrXe)
					if(xe.getMau().contains(timmau)) {
						System.out.print(xe.in()+"\n");
						
				}
				
			break;
			}
			
			}
		}while(ch!=0);
	}

}

