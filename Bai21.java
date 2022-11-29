//21. Cho 2 con kangaroo ở tren cùng 1 đường, vị trí dương. Cho x1, x2 lần lượt là địa
//chỉ của kan1 và kan2; v1, v2 lần lượt là vận tốc của kan1 và kan 2.
//Điều kiện: 0 <= x1 < x2 < 10000; 1 <= v1, v2 <= 10000
//Sau 1 lần nhảy, vị trí 2 con kan sẽ tăng thêm bằng đúng vận tốc của từng con
//Hỏi là 2 con kan có gặp nhau được hay không. Các số x1, x2, v1, v2 được nhập từ
//bàn phím
import java.util.Scanner;
public class Bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập địa chỉ Kan1 : ");
        int x1 = scanner.nextInt();
        if(x1<0||x1>10000){
            System.out.println("Địa chỉ Kan1 không đúng điều kiện");
                System.exit(-1);
        }
        System.out.println("Nhập vận tốc Kan1 : ");
        int v1 = scanner.nextInt();
        if (v1<1||v1>10000){
            System.out.println("Vận tốc Kan1 không đúng điều kiện");
            System.exit(-1);
        }
        System.out.println("Nhập địa chỉ Kan2 : ");
        int x2 = scanner.nextInt();
        if (x2<x1||x2>10000){
            System.out.println("Địa chỉ Kan2 không đúng điều kiện");
            System.exit(-1);
        }
        System.out.println("Nhập vận tốc Kan2 : ");
        int v2 = scanner.nextInt();
        if (v2<1||v2>10000){
            System.out.println("Vận tốc Kan1 không đúng điều kiện");
            System.exit(-1);
        }
        if(x2>x1 && v2> v1){
            System.out.println("Kan1 và Kan2 không gặp nhau");
        }else{
            while(x2 > x1){
                x2 = x2 + v2;
                x1 = x1 + v1;
                if(x1 == x2){
                    System.out.println("Kan 1 và Kan 2 gặp nhau tại vị trí : "+x1);
                    break;
                }
                if(x1 > x2){
                    System.out.println("Kan1 và Kan2 không gặp nhau");
                    break;
                }
            }
        }
    }
}
