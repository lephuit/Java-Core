import java.util.Scanner;

//18. Chương trình tính và in số năm chờ đợi. Anh X có một số tiền nhàn rỗi. Anh
//đem gởi tiết kiệm số tiền này. Anh X hy vọng rằng đến một lúc nào đó trong tương
//lai anh sẽ có đủ tiền để mua một chiếc ô tô. Cho biết số tiền anh X gửi, số tiền
//anh X muốn có trong tương lai và tiền lãi tiết kiệm. Hãy viết chương trình tính số
//năm ít nhất mà anh X phải chờ đợi kể từ năm gởi tiền. Giả sử lãi suất tiết kiệm
//không đổi, anh X không rút bớt tiền và cũng không gởi thêm tiền trong thời gian
//chờ đợi.
import java.util.Scanner;
public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập số tiền anh X cần gửi tiết kiệm : ");
        float tienGui = scanner.nextFloat();
        System.out.print(" Nhập số tiền anh X muốn nhận được : ");
        float tienNhan = scanner.nextFloat();
        int year =1;
        if(tienGui>tienNhan){
            System.out.println("Mua xe luôn anh ơi, thừa tiền rồi!");
        }else {
            System.out.print(" Nhập % lãi tiết kiệm : ");
            float lai = scanner.nextFloat();
            float tienLai=lai*tienGui;
            for(int i=1;(tienGui +(tienLai*i))<=tienNhan;i++){
                year=i;
            }
            System.out.println("Số năm cần gửi để đủ tiền mua xe là : "+year);
        }

    }
}
