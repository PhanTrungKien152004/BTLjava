package Main;
import List.DsDienThoai;
import List.DsKhachHang;
import List.DsNhanVien;
import List.DsPhuKien;
import List.DsTHI_MORONG;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Quản lý danh sách khách hàng");
            System.out.println("2. Quản lý danh sách nhân viên");
            System.out.println("3. Quản lý danh sách điện thoại");
            System.out.println("4. Quản lý danh sách phụ kiện");
            System.out.println("5. Quản lý danh sách THI_MORONG");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    DsKhachHang dsKhachHang = new DsKhachHang();
                    dsKhachHang.menu();
                    break;
                case 2:
                    DsNhanVien dsNhanVien = new DsNhanVien();
                    dsNhanVien.menu();
                    break;
                case 3:
                    DsDienThoai dsDienThoai = new DsDienThoai();
                    dsDienThoai.menu();
                    break;
                case 4:
                    DsPhuKien dsPhuKien = new DsPhuKien();
                    dsPhuKien.menu();
                    break;
                case 5:
                	DsTHI_MORONG ds = new DsTHI_MORONG();
                	ds.menu();
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
}
