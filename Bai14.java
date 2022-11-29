//14. Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng.
//Xóa đi các phần tử bị lặp lại.
import java.util.Scanner;
public class Bai14 {
    public static void XuatMang(int [] array){
        for ( int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t ");
        }
    }
    public static void XoaPhanTu(int[] array, int index){
        for(int i=index;i<array.length;i++){
            array[i-1]=array[i];
        }
    }
    public static void main(String[] args) {
        int n,i,j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng");
        n=scanner.nextInt();
        int[] array = new int[n];
        for(i=0;i<n;i++){
            System.out.print("Nhập vào phần tử Array["+(i+1)+"] = ");
            array[i]=scanner.nextInt();
        }
        System.out.print("\nMảng vừa nhập là: ");
        XuatMang(array);
        int k=array.length;
        for(i=0;i<k-1;i++){
            for(j=(i+1);j<k;j++) {
                if (array[i] == array[j]) {
                    XoaPhanTu(array,j);
                    i--;
                    k--;
               }
            }
        }
        if(k==array.length){
            System.out.print("\nMảng không có phần tử trùng nhau: ");
            XuatMang(array);
        }else {
            System.out.print("\nMảng vừa xoá các phần tử trùng nhau là: ");
            for (i = 0; i < k; i++) {
                System.out.print(array[i] + "\t ");
            }
        }

    }
}
//chua xong
