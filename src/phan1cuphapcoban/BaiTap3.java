package phan1cuphapcoban;

import java.util.Scanner;

import static java.lang.System.*;

public class BaiTap3 {

    public static void main(String[] args) {
        int height;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao tam giác: ");
        height = sc.nextInt();
        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == height)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

        sc.close();
    }

}
