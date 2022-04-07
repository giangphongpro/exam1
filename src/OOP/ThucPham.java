package OOP;

import java.util.Scanner;

public class ThucPham extends LoaiHang {
    private String nhaCungCap;
    private String ngaySx;
    private String ngayHetHan;

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nha cung cap: ");
        nhaCungCap = sc.nextLine();
        System.out.println("Nhap ngay san xuat: ");
        ngaySx = sc.nextLine();
        System.out.println("Nhap ngay het han");
        ngayHetHan = sc.nextLine();
    }

    public void hienThi(){
        super.hienThi();
        System.out.printf("%10s %8s %8s %10f",nhaCungCap,ngaySx,ngayHetHan,vat());
    }

    @Override
    public double vat() {
        return donGia*0.05;
    }
}
