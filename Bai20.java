//20. Viết chương trình tách một mảng số tự nhiên được nhập từ bàn phím thành 2
//mảng: một mảng chẵn + một mảng lẻ
import java.util.Scanner;
public class Bai20 {
    public static void NhapMang(int[] array){
        Scanner scanner = new Scanner(System.in);
        for (byte i = 0; i < array.length; i++) {
            System.out.print("A["+(i+1)+"]=");
            array[i] = scanner.nextInt();
        }
    }
    public static void XuatMang(int [] array, byte n){
        for (byte i = 0; i < n; i++) {
            System.out.print(array[i]+"\t ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng : ");
        byte n = scanner.nextByte();
        int array[] = new int[n];
        int chan[] = new int[n];
        int le[] = new int[n];
        byte j=0,k=0;
        NhapMang(array);
        // Hiển thị mảng vừa nhập
        System.out.println("Mảng vừa nhập là: ");
        XuatMang(array,n);
        for (byte i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                chan[j] = array[i];
                j++;
            } else {
                le[k] = array[i];
                k++;;
            }
        }
        System.out.println("\n Mảng chẳn có "+j+" phần tử là :");
        XuatMang(chan,j);
        System.out.println("\n Mảng lẻ có "+k+" phần tử là :");
        XuatMang(le,k);
    }
}