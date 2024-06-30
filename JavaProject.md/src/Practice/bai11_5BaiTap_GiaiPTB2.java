package Practice;

import java.util.Scanner;

public class bai11_5BaiTap_GiaiPTB2 {
    public static void main(String[] args) {
        //he phuong trinh bac 2 voi a # 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("a 입력하세요");
        double a = scanner.nextDouble();
        System.out.println("b 입력하세요");
        double b = scanner.nextDouble();
        System.out.println("c 입력하세요");
        double c = scanner.nextDouble();
        // giai he phuong trinh delta= b^2-4ac
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("솔루션이 없다");
        } else if (delta == 0) {
            double x = -b / (2 * a );
            System.out.println("솔루션은 x1 = x2 = " + x + "이다");
        } else {
            double x1 = -b + Math.sqrt(delta) / (2 * a);
            double x2 = -b - Math.sqrt(delta) / (2 * a);
            System.out.println("솔류션은 x1= " + x1 + " x2= " + x2);
        }

    }}