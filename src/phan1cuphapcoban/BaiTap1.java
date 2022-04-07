package phan1cuphapcoban;

import java.util.Scanner;

import static java.lang.System.*;

//chương trình in ra tổng của 10 số chẵn đầu tiên
public class BaiTap1 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(in);
        out.println("Nhập N số chẵn: ");
        n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i * 2;
        }

        //In ra màn hình
        out.println("Tổng 10 số chẵn đầu tiên:" + sum);
    }
}