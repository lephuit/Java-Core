/*Viết chương trình cho phép nhập vào một số tự nhiên và in ra tổng các chữ số
    của số tự nhiên đó */
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        int total = 0;
        do {
            total = total + n % 10;
            n = n /10;
        } while (n > 0);
        System.out.printf("Tổng của các chữ số là  :"+total);
    }
}
