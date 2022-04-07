package phan2file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class BaiTap2 {
    public void readFile(String pathFileReader, String pathFileWriter, String s) {
        try {
            File file = new File(pathFileReader);
            FileReader fileReader = new FileReader(file);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();

            FileWriter fileWrite = new FileWriter((pathFileWriter));

            while (line != null) {
                if (line.contains(s)) {
                    fileWrite.write(line);
                }
                line = reader.readLine();
            }
            fileReader.close();
            fileWrite.close();

        } catch (Exception e) {
            out.println("Không tìm thấy file");
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        out.println("Nhập file cần đọc: ");
        String pathReader = sc.next();
        out.println("Nhập file cần ghi: ");
        String pathWriter = sc.next();
        out.println("Hiển thị đường dẫn sau khi nhập: ");
        out.println("Đường dẫn file đọc: " + pathReader);
        out.println("Đường dẫn file ghi: " + pathWriter);
        String s = "VIS training";
        BaiTap2 handingFile = new BaiTap2();
        handingFile.readFile(pathReader, pathWriter, s);
    }


}
