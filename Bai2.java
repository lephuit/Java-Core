//2. Viết chương trình chuyển đổi số từ hệ cơ số 10
//sang hệ cơ số nhị phân và ngược lại.
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHUYEN SO THAP PHAN SANG NHI PHAN");
        System.out.print("Nhap so can chuyen : ");
        int number = scanner.nextInt();
        System.out.println("Chuyen " + number + " sang nhi phan ta duoc : " + Integer.toBinaryString(number));
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhap vao so nhi phan can chuyen: ");
        String binaryString = scanner1.next();
        char[] ch = binaryString.toCharArray();
        char[] array = {'0','1'};
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==array[1]||ch[i]==array[0]){
                continue;
            }else{
                System.out.println("Chuoi vua nhap khong phai la chuoi nhi phan");
            }
        }
        System.out.println("Gia tri thap phan cua "+binaryString+" la: " + Integer.parseInt(binaryString, 2));
    }
}
