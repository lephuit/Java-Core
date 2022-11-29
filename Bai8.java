//Viết chương trình cho phép nhập vào một chuỗi viết thường, in ra chuỗi trên với
//các ký tự đầu tiên được viết in hoa
import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String chuoi = scanner.nextLine();
        // Ham tách chuỗi
        String[] words = chuoi.split(" ");
        String xuatChuoi = "";
        System.out.print("Doi chu cai in hoa dau tien : ");
        //sdasdasd
        for (int i = 0; i <=chuoi.length(); i++) {
            String chuCaiDau = words[i].substring(0, 1);
//            String chuConLai = words[i].substring(1, words.length());
            //toUpperCase() để chuyển đổi thành chữ in hoa
            chuCaiDau = chuCaiDau.toUpperCase();
//            xuatChuoi = chuCaiDau + chuConLai;
            System.out.println(xuatChuoi);
        }
    }
}
