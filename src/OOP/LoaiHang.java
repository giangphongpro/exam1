package OOP;

import java.util.Scanner;

import static java.lang.System.*;

public abstract class LoaiHang {
    protected String maHang;
    protected String tenHang;
    protected int luongTon;
    protected int donGia;

    public abstract double vat();

    public void hienThi() {
        out.printf("%8s %-20s %10d %10d", maHang, tenHang, luongTon, donGia);
    }

    public void nhap() {
        Scanner sc = new Scanner(in);
        out.println("Nhap ma hang: ");
        maHang = sc.nextLine();
        out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        out.print("Nhap so luong ton kho : ");
        luongTon = sc.nextInt();
        out.print("Nhap don gia: ");
        donGia = sc.nextInt();
    }

    public boolean kiemTraTenHang(boolean k) {
        if (this.tenHang == "" || this.tenHang.isEmpty()) {
            System.out.println("Tên hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
    public boolean kiemTraMaHang(boolean k) {
        if (this.maHang == "" || this.maHang.isEmpty()) {
            System.out.println("Mã hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }


    public boolean kiemTraLuongTonKho(boolean k){
        if(this.luongTon < 0){
            out.println("Lượng tồn phải lớn hơn hoặc bằng 0");
        }else {
            k = false;
        }
        return k;
    }

    public boolean kiemTraDonGia(boolean k) {
        if (this.donGia < 0) {
            System.out.println("Đơn giá phải lớn hơn 0 ");
        } else {
            k = false;
        }
        return k;
    }





}
