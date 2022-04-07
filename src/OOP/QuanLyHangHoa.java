package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHangHoa {
    static ArrayList<LoaiHang> list = new ArrayList<LoaiHang>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----Quan Ly Danh Sach Hang Hoa-----");
        System.out.println("Nhap thong tin hang hoa: ");
        System.out.println("1.Dien may");
        System.out.println("2.Sanh su");
        System.out.println("3.Dien may");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1:
                hangDienMay();
                break;
            case 2:
                hangSanhSu();
                break;
            case 3:
                hangThucPham();
                break;
            default:
                System.out.println("Lua chon sai, thoat chuong trinh!");
                break;
        }
    }

    private static void hangDienMay() {

    }

    private static void hangSanhSu() {
    }

    private static void hangThucPham() {
    }
}
