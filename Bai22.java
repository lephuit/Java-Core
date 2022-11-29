//22. Viết chương trình cho phép nhập vào String, tìm ra sub string palindromic có độ
//dài dài nhất. VD:
//input: thequickbrownfoxxofnworbquickthe
//output: xofnworbquickthe
import java.util.Scanner;
import java.lang.String;
public class Bai22 {
    public static void CheckPalindromic(String str)
    {
        String output = "";
        int left = 0, right = str.length() - 1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                System.out.println("Chuỗi trên không phải chuỗi palindromic");
                System.exit(0);
            }
            output=str.charAt(right)+output;
            left++;
            right--;
        }
        System.out.println("Chuỗi trên là phải chuỗi palindromic");
        System.out.println("Output : "+output);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập chuỗi ký tự: ");
        String input = scanner.nextLine();
        CheckPalindromic(input);
    }
}
