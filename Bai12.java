//Viết chương trình cho phép nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác
//vuông có độ dài tương ứng. VD: nhập vào số 4 sẽ in ra kết quả:
import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tự nhiên n (từ 1 đến 9) : ");
        byte n = scanner.nextByte();
        if (n>9||n<1){
            System.out.print("Số vừa nhập không đúng");
        }else {
            System.out.print("Tam giác vuông có độ dài tương ứng: ");
            for (byte i=1;i<=n;i++){
                System.out.println(" ");
                for(byte j=1;j<=i;j++)
                    System.out.print(j);
            }
        }
    }
}
