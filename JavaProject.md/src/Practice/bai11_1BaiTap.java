package Practice;

import java.util.Scanner;

public class bai11_1BaiTap {
    //x+y= 14 x-y=4 tim x va y
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tổng của x và y =");
        float tong = scanner.nextFloat();
        System.out.println("nhập hiệu của x và y =");
        float hieu = scanner.nextFloat();

        // tinh toan
        float x = (tong + hieu )/2;
        float y = tong - x;
        System.out.println("giá trị của x là " +x);
        System.out.println("giá trị của y là " +y);

    }
}
