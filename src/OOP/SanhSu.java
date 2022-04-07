package OOP;

import java.util.Scanner;

public class SanhSu extends LoaiHang{
    private String nhaSx;
    private String ngayNhapKho;

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nha san xuat: ");
        nhaSx =sc.nextLine();
        System.out.println("Nhap ngay nhap kho: ");
        ngayNhapKho = sc.nextLine();
    }
    public void hienThi(){
        super.hienThi();
        System.out.printf("%8s %8s %10f",nhaSx,ngayNhapKho,vat());
    }
    @Override
    public double vat() {
        return donGia*0.1;
    }
}
