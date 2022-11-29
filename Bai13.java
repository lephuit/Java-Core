//Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng.
//Tính:
//a) Tính giá trị trung bình
//b) Tìm phần tử lớn nhất, nhỏ nhất
//c) Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng
//d) Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng
//e) In ra các phần tử chẵn, lẻ
//f) Thêm một phần tử theo index
//g) Xóa một phần tử theo index

import java.util.Scanner;
public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng : ");
        byte n = scanner.nextByte();
        int array[] = new int[n];
        for (byte i=0;i<n;i++){
            System.out.print("Nhập vào phần tử thứ "+(i+1)+" của mảng : ");
            array[i]=scanner.nextInt();
        }
        // Hiển thị mảng vừa nhập
        System.out.print("\nMảng vừa nhập là: ");
        for (byte i = 0; i < n; i++) {
            System.out.print(array[i] + "\t ");
        }
        //a) Tính giá trị trung bình
        System.out.println("\nGiá trị trung bình của mảng là : "+trungBinhCong(array));
        //b) Tìm phần tử lớn nhất, nhỏ nhất
        System.out.println("b) Tìm phần tử lớn nhất, nhỏ nhất");
        System.out.print("Phần tử nhỏ nhất : "+TimMin(array));
        System.out.print("\nPhần tử lớn nhất : "+ TimMax(array));
        //c) Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng
        System.out.println("\nC. Phần tử âm nhỏ nhất trong mảng : ");
        TimSoAmMinMax(array);
        //d) Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng
        System.out.println("d) Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng");
        TimSoDuongMinMax(array);
        //e) In ra các phần tử chẵn, lẻ
        System.out.println("e) In ra các phần tử chẵn, lẻ");
        KiemTraChanLe(array);
        //f) Thêm một phần tử theo index
        System.out.println("\nf) Thêm một phần tử theo index");
        Insert(array);
        //g) Xóa một phần tử theo index
        System.out.println("\ng) Xóa một phần tử theo index");
        Delete(array);
    }
    public static float trungBinhCong(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+ array[i];
        }
        float trungBinhCong=sum/array.length;
        return trungBinhCong;
    }
    public static int TimMax(int[]  array){
        int max=array[0];
        for (byte i = 0; i < array.length ; i++) {
            //tìm max
            if (array[i]>=max){
                max=array[i];
            }
        }
        return max;
    }
    public static int TimMin(int[]  array){
        int min=array[0];
        for (byte i = 0; i < array.length ; i++) {
            //tìm max
            if (array[i]<=min){
                min=array[i];
            }
        }
        return min;
    }
    public static void TimSoAmMinMax(int[]  array){
        byte count=0;
        int a[]=new int[array.length];
        for (byte i = 0; i < array.length ; i++) {
            //tìm số âm
            if(array[i]<0){
                a[count]=array[i];
                count++;
            }
        }
        if (count==0){
            System.out.println("Mảng không có phần tử âm");
        }else {
            int min=a[0];
            for (byte i = 0; i < count ; i++) {
                if(a[i]>min){
                    min=a[i];
                }
            }
            int max=a[0];
            for (byte i = 0; i < count ; i++) {
                if(a[i]<max){
                    max=a[i];
                }
            }
            System.out.println("Phần tử âm nhỏ nhất "+ min);
            System.out.println("Phần tử âm lớn nhất "+ max);
        }
    }
    public static void TimSoDuongMinMax(int[]  array){
        byte count=0;
        int a[]=new int[array.length];
        for (byte i = 0; i < array.length ; i++) {
            //tìm số âm
            if(array[i]>0){
                a[count]=array[i];
                count++;
            }
        }
        if (count==0){
            System.out.println("Mảng không có phần tử âm");
        }else {
            int min=a[0];
            for (byte i = 0; i < count ; i++) {
                if(a[i]<min){
                    min=a[i];
                }
            }
            int max=a[0];
            for (byte i = 0; i < count ; i++) {
                if(a[i]>max){
                    max=a[i];
                }
            }
            System.out.println("Phần tử dương nhỏ nhất "+ min);
            System.out.println("Phần tử dương lớn nhất "+ max);
        }
    }

    public static void KiemTraChanLe(int [] array){
        int chan[]= new int[array.length];
        int le[]= new int[array.length];
        byte demChan =0,demLe=0,i;
        for(i=0;i<array.length;i++){
            if(array[i]% 2 == 0){
                chan[demChan]=array[i];
                demChan++;
            }else{
                le[demLe]=array[i];
                demLe++;
            }
        }
        System.out.print("Các phần tử chẳn trong mảng là : ");
        for(i=0;i<demChan;i++){
            System.out.print("\t"+chan[i]);
        }
        System.out.print("\nCác phần tử lẻ trong mảng là : ");
        for(i=0;i<demLe;i++){
            System.out.print("\t"+le[i]);
        }
    }
    public static void Insert(int[] array){
        int array2[]= new int[array.length+1];
        byte i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập vào vị trí cần chèn: ");
        byte index= scanner.nextByte();
        if (index>array.length){
            System.out.println("Vị trí cần chằn lớn hơn độ dài của mảng");
            System.exit(-1);
        }
        index = (byte) (index-1);
        System.out.print("Nhập vào giá trị cần chèn: ");
        byte k= scanner.nextByte();
        for ( i=0;i<array.length;i++){
            if(i<index){
                array2[i]=array[i];
            }
            if(i == index){
                array2[i]=k;
            }
            if(i>index){
                array2[i]=array[i-1];
                array2[i+1]=array[i];
            }
        }
        System.out.println("Chuỗi vừa chằn "+k+" vào vị trị "+(index+1)+" là ");
        for (i=0;i<array2.length;i++){
            System.out.print(array2[i]+"\t");
        }
    }
    public static void Delete(int []array){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập vào vị trí cần xoá: ");
        byte index= scanner.nextByte();
        if (index>array.length||index<=0){
            System.out.println("Vị trí cần xoá lớn hơn độ dài của mảng");
            System.exit(-1);
        }
        index = (byte) (index-1);
        for ( byte i=index;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        System.out.println("Chuỗi vừa xoá vào vị trị "+(index+1)+" là ");
        for (byte i=0;i<array.length-1;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
