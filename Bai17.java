//17. Chương trình cho phép máy tính phát sinh ngẫu nhiên một số từ 1 đến 1000.
//Người dùng sẽ đoán và nhập, nếu đúng với kết quả của máy, game sẽ dừng.
//Ngược lại máy sẽ báo bạn đang nhập một số lớn hơn hoặc nhỏ hơn số bí mật
import java.util.Random;
import java.util.Scanner;
public class Bai17 {
    public static void KiemTra() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhập số dự doán từ 1 đến 1000 ");
        int input = scanner.nextInt();
        if (input < 1 || input > 1000) {
            System.out.println("Số vừa nhập không đúng yêu cầu!");
        } else {
            int soRandom = random.nextInt(1001);
            System.out.println("Số ngẫu nhiên của máy là : " + soRandom);
            if (input == soRandom) {
                System.out.println("Số vừa nhâp đúng với dự đoán của máy");
                System.exit(0);
            }else {
                if(input<soRandom){
                    System.out.println("Số vừa nhập nhỏ hơn số bí mật");
                }else{
                    System.out.println("Số vừa nhập lớn hơn số bí mật");
                }
                System.out.println("Số vừa nhập không đúng dự đoán vui lòng nhập lại: ");
                KiemTra();
            }
        }
    }
    public static void main(String[] args) {
        KiemTra();
    }
}
