package List;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import SubClass.THI_MORONG;
public class DsTHI_MORONG {
	ArrayList<THI_MORONG> gd = new ArrayList<>();
    public void nhapDS()
    {
   	 Scanner sc = new Scanner(System.in);
   	 System.out.print("Nhap SL giam doc: ");
   	 int SLgd = sc.nextInt();
   	 for(int i=0;i<SLgd;i++)
   	 {
   		 System.out.println("--------Giám Đốc "+(i+1)+"-------");
   		 THI_MORONG giamdoc = new THI_MORONG();
   		 giamdoc.Nhap();
   		 gd.add(giamdoc);
   	 }
    }
    public void XuatDS(){
	        System.out.println("Danh sách giám đốc");
	        System.out.println("=========================Danh sách giám đốc=======================");
	        System.out.printf("%-10s%-10s%-5s%-15s%-15s%-5s%-10s%-10s%n", "Mã NV","Họ tên", "GT", "SĐT", "Email","HSL","LCB" ,"Lương");
	        for (THI_MORONG giamdoc:gd){
	            giamdoc.Xuat();
	            System.out.println();
	        }
	}
    public void Timkiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã GD cần tìm: ");
        String sMatk = scanner.nextLine();
        boolean bTimthay = true;
        for (THI_MORONG giamdoc:gd){
            if (sMatk.equals(giamdoc.getMaGD())) {
                giamdoc.Xuat();
                bTimthay = false;
            }
        }
        if (bTimthay) System.out.println("Không tìm thấy giám đốc!!");
        System.out.println();
    }
    public void SapXepgiam()
    {
   	 System.out.println("Danh sach sau khi SX giam dan");
   	 Collections.sort(gd, Comparator.comparing(THI_MORONG::getLuong).reversed());
   	 for(THI_MORONG x:gd)
   	 {
   		 x.Xuat();
   		 System.out.println();
   	 }
    }
    public void menu()
    {
    	DsTHI_MORONG ds = new DsTHI_MORONG();
    	Scanner sc = new Scanner(System.in);
    	int chon;
    	do
    	{
    		System.out.println("===== MENU THI_MORONG =====");
            System.out.println("1. Nhập danh sách giám đốc");
            System.out.println("2. Xuất danh sách giám đốc");
            System.out.println("3. Tìm kiếm giám đốc bằng mã GD");
            System.out.println("4. Sắp xếp lương của giám đốc giảm dần");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            chon=sc.nextInt();
            sc.nextLine();
            switch(chon)
            {
            	case 1: nhapDS();break;
            	case 2: XuatDS();break;
            	case 3: Timkiem();break;
            	case 4: SapXepgiam();break;
            	case 0: System.out.println("Thoat chuong trinh");
            	default: System.out.println("Lua chon khong hop le");
            }
    	}while(chon!=0);
    }
}
