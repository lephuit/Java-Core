//Viết chương trình cho phép nhập vào một số tự nhiên và in ra các ước số của số
//tự nhiên đó
import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can tim uoc : ");
        int number = scanner.nextInt();
        System.out.println("Cac uoc so cua: " + number + " la : ");
        if (number<=1){
            System.out.println("Số vừa rồi nhập không đúng");
        }else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + "\t");
                }
            }
        }
    }
}
