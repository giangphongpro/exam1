package phan1cuphapcoban;

import java.util.Scanner;

import static java.lang.System.*;

//Tính tổng N số nguyên tố đầu tiên
public class BaiTap2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.println("Nhập N số nguyên tố: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            //
            if (isPrime(i)) {
                sum += i;
            }
        }

        out.println("Tổng số nguyên tố của N là: " + sum);
    }

    public static boolean isPrime(int n) {

        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }
}
