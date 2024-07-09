package Practice;

import java.util.Scanner;

public class bai17_2BaiTap {
    public static void main(String[] args) {
        // viết chương trình nhập a
        // a chẵn thì tính tổng từ 0 đến a
        // a lẽ thì kết thúc
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int a = scanner.nextInt();
        int tong=0;
        if (a%2 !=0)
        {
            System.out.println("không tính tổng số lẻ");
        }
        else{
            for (int i = 0; i <= a ; i+= 2) {
                tong+=i;

            }
        }
        System.out.println(" tổng các số chẳn từ 0 đến "+a +" là " +tong);

    }
}
