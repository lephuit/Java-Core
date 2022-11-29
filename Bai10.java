//Viết chương trình cho phép nhập vào số tự nhiên n, in ra tổng các số nguyên tố
//từ 1 đến n,
import java.util.Scanner;
public class Bai10 {
    //kiem tra so nguyen to
   public static boolean isPrimeNumber(int n) {
        if (n < 2) {return false;}
        else {
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHAP VAO N : ");
        int n = scanner.nextInt();
        System.out.println("Cac so nguyen to nho hon n la: ");
        if (isPrimeNumber(n)){
            for (int i = 2; i < n; i++) {
                if (isPrimeNumber(i)) {
                    System.out.print(i + " ; ");
                }
            }
        }else {
            System.out.println("Không có số nguyên tổ nhỏ hơn " +n);
        }
    }
}
