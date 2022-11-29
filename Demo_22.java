
import java.util.Scanner;
public class Demo_22 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.print("A["+i+"] ");
            arr[i] = scanner.nextInt();
        }
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}