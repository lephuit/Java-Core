//16. Viết chương trình kiểm tra xem năm nhập vào có phải năm nhuận hay không?
import java.util.Scanner;
public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra");
        int year = scanner.nextInt();
        boolean check = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    System.out.println("Năm "+year + " là năm nhuận.");
                else
                    System.out.println("Năm "+year + " không phải là năm nhuận.");
            }
            else
                System.out.println("Năm "+year + " là năm nhuận.");
        }
        else {
            System.out.println("Năm "+year + " không phải là năm nhuận.");
        }
    }
}
