//19. Viết chương trình giải phương trình bậc 1 và bậc 2. Trình bày dưới dạng
//menu cho phép lựa chọn
import java.text.DecimalFormat;
import java.util.Scanner;
public class Bai19 {
    public static void PhuongTrinhBac1(){
        double nghiem;
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc bậc 1");
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }
    public static void PhuongTrinhBac2(){
        int a, b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc bậc 2");
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        System.out.println("Nhập vào số c: ");
        c = scanner.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x^2 + " + b + "x + "+c+" = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    public static void main(String[] args) {
        PhuongTrinhBac1();
        PhuongTrinhBac2();
    }
}