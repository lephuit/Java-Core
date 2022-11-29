//Viết chương trình cho phép nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lại
//(VD: nhập vào Cybersoft, in ra tfosrebyC)
import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can dao: ");
        String chuoi = scanner.nextLine();
        StringBuilder str = new StringBuilder(chuoi);
        System.out.println("Chuoi da dao la: "+str.reverse().toString());
    }
}
