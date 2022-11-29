//Viết chương trình cho phép nhập vào 2 số nguyên dương (từ 10 đến 99), in TRUE
//nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại in ra FALSE (VD: (12, 81) => true,
//(23, 89) => false)
import java.util.Scanner;
public class Bai9 {
    public static void CheckIn(byte n){
        if(n<10||n>99){
            System.out.println("So vua nhap phai khong dung yeu cau! ");
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhap so thu nhat
        System.out.println("Nhap vao 2 so co 2 chu so ");
        System.out.print("Nhap vao so thu nhat : ");
        byte so1 = scanner.nextByte();
        CheckIn(so1);
        double donvi1 = so1 % 10;
        donvi1 = (Math.floor(donvi1 * 1) / 1);
        double chuc1 = (so1 - donvi1) / 10;
        //nhap so thu 2
        System.out.print("Nhap vao so thu thu 2 : ");
        byte so2 = scanner.nextByte();
        CheckIn(so2);
        double donvi2 = so2 % 10;
        donvi2 = (Math.floor(donvi2 * 1) / 1);
        double chuc2 = (so2 - donvi2) / 10;
        //kiem tra
        System.out.println("TRUE nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại in ra FALSE");
        if (donvi1 == donvi2 || chuc1 == chuc2 || donvi1 == chuc2 || donvi2 == chuc1) {
            System.out.println("=> TRUE ");
        } else {
            System.out.println("=> FALSE ");
        }
    }
}
