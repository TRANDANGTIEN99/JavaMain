package Practice;

import java.util.Scanner;
// nhập n từ bàn phím
// n nằm trong khoảng 1-99
// sai phải nhập lại
public class bai14_While_BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào số nguyên từ 1 đến 99");
        int n = scanner.nextInt();
        while (n<1 || n>99){ // hai dấu || là hoặc
            System.out.println("n chỉ nằm trong khoảng 1 đến 99 . hãy nhập lại");
            n = scanner.nextInt();// udate lại biến n khi khai báo lại.
        }
        System.out.println("  bạn đã nhập với n là " +n);
    }
}
