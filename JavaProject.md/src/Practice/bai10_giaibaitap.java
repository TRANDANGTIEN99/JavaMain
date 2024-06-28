package Practice;

import java.util.Scanner;

public class bai10_giaibaitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 반경 입력하세요 ");
        double r = scanner.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r,2);//pi*r^2


        System.out.println("chu vi " +cv);
        System.out.println(" dien tich " + dt);
    }
}
