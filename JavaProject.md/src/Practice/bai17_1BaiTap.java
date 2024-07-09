package Practice;

import java.util.Scanner;

public class bai17_1BaiTap {
    public static void main(String[] args) {
        //nhập số nguyên n in ra n!. dùng vòng lặp for và vòng lặp while
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên n: ");
        int n = scanner.nextInt();
        int gt = 1;

        for (int i = 1; i <=n; i++) {
            System.out.println(i);
            gt=gt*i;// tính giai thừa

        }
        System.out.println(gt);
    }*/


        //thay vì dùng for thử dùng while
        int n;
        int i = 1;
        int gt = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên\rn: ");
        n = scanner.nextInt();

        while (i<=n){
            gt=gt*i;
            i++;

        }System.out.println(n+"! = "+gt);
}}
