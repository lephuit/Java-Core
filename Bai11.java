//Viết chương trình cho phép nhập vào số tự nhiên n, in ra số tự nhiên lớn nhất nhỏ
//hơn log2 (n).
import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHAP VAO N : ");
        int x = scanner.nextInt();
        double log2x = Math.log(x) / Math.log(2);
        int max=0;
        for(int i=0;i<log2x;i++){
            max=i;
        }
        System.out.println("So tu nhien lon nhat nho hon log2("+x+") la: "+max);
    }
}
