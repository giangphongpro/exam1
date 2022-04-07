package OOP;

import java.util.Scanner;

public class DienMay extends LoaiHang {
    private String baoHanh;
    private int congSuat;

    public void hienThi() {
        super.hienThi();
        System.out.printf("%8s %5d %7f", baoHanh, congSuat, vat());
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thoi gian bao hanh: ");
        baoHanh = sc.nextLine();
        System.out.println("Nhap cong suat:  ");
        congSuat = sc.nextInt();
    }

    @Override
    public double vat() {
        return donGia * 0.1;
    }
}
