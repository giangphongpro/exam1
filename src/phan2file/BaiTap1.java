package phan2file;

import java.util.Scanner;


import static java.lang.System.*;

public class BaiTap1 {

    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(in);
        do {
            String emailPattern= "[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@+(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            out.print("Nhập email của bạn");
            String input = sc.next();
            flag = input.matches(emailPattern);
            if (!flag)
                out.println("Sai định dạng");
        } while (!flag);
        out.println("Định dạng đúng");
    }

}
