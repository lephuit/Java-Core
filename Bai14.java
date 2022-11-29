//14. Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng.
//Xóa đi các phần tử bị lặp lại.
import java.util.ArrayList;
import java.util.Scanner;
public class Bai14 {
    public static void main(String[] args) {
		int number;
		ArrayList<Integer> arrListNumber = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử trong mảng " );
		int lengthArr=scanner.nextInt();
		for (int i = 0; i < lengthArr; i++) {
			System.out.print(" A[" +( i+1 )+ "]=  ");
			number = scanner.nextInt();
			arrListNumber.add(number);
		}
		System.out.println("Mảng vừa nhập là: "+arrListNumber);
		ArrayList<Integer> arrTemp = new ArrayList<>();	 
		for (int i = 0; i < arrListNumber.size(); i++) {
			if (!arrTemp.contains(arrListNumber.get(i))) {
				arrTemp.add(arrListNumber.get(i));
			}
		}
		arrListNumber.clear();
		arrListNumber.addAll(arrTemp);
		System.out.println("Mảng đã xoá các phần tử trùng nhau là: ");
		System.out.println(arrListNumber);
	}

    
}

