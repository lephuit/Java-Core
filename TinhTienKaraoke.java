
import java.util.Scanner;
public class TinhTienKaraoke {
    public static void main(String[] args) {
        int a,b,nuoc;
        float tien=0;
        Scanner nhap= new Scanner(System.in);
        System.out.println("TÍNH TIỀN KARAOKE");
        System.out.print("Nhập giờ bắt đầu : ");
        a = nhap.nextInt();
        System.out.print("Nhập giờ kế thúc: ");
        b = nhap.nextInt();
        System.out.print("Nhap so nuoc da su dung : ");
        nuoc = nhap.nextInt();
        nuoc=nuoc*10000;
        float them = 27000;
        int gio = b-a;
        if(a>9&&b>9&&a<24&&b<24){
            if(a<b){
                if(a>17)
                    if (gio <= 3) {
                        tien = tien + gio * 30000+nuoc;
                    } else {
                        tien = tien + 90000 + (gio-3)*them+nuoc ;
                     }
                else{//a<17
                    if(b<17){
                        tien = (tien + gio * 30000+nuoc)*80/100;
                    }else {
                        //b>17
                        if (gio <= 3) {
                            tien = (tien + gio * 30000+nuoc)*80/100;
                        } else {
                            tien = (tien + 90000 + (gio-3)*them+nuoc)*80/100 ;
                        }
                    }
                }
                System.out.print("Tổng chi phí phải trả là : "+tien+" VNĐ");
            }else {
                System.out.print("Gio bat dau phai nho hon gio ket thuc");
            }
        }else{
            System.out.print("Gio phai lon hon 9 va nho hon 24");
        }
    }
}