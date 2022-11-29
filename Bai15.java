
//15. Viết chương trình cho phép nhập vào một chuỗi:
//a) In ra độ dài của chuỗi
//b) In ra ký tự (char) tại một vị trí nhất định (index)
//c) Kiểm tra xem, trong chuỗi vừa nhập có chuỗi phụ "abcdef" hay khôngs
import java.util.Scanner;
public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String chuoi = scanner.nextLine();
        System.out.println("a) Độ dài của chuỗi là "+chuoi.length()+" ký tự.");
        //b) In ra ký tự (char) tại một vị trí nhất định (index)
        System.out.println("b) In ra ký tự (char) tại một vị trí nhất định (index)");
        byte n=0;
        for(int i=0;i<chuoi.length();i++){
            int thapPhan=chuoi.charAt(i);
            if((thapPhan>31&&thapPhan<48)||(thapPhan>57&&thapPhan<127)) {
                System.out.println("Ký tự " + chuoi.charAt(i) + " ở vị trí " + (i + 1));
                n++;
            }
        }
        if(n==0){
            System.out.println("Chuỗi không có ký tự (char)");
        }
        String chuoi2 = "abcdef";
        if(chuoi.contains(chuoi2)){
            System.out.println("c)Chuỗi trên có chứa chuỗi phụ abcdef");
        }else {
            System.out.println("c)Chuỗi trên không chứa chuỗi phụ abcdef");
        }

    }
}
