package Practice;

import java.util.Scanner;

public class bai11_3BaiTap_NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào một năm dương lịch");
        int nam = scanner.nextInt();
        if (((nam%4==0) && (nam%100!=0)) ||(nam %400==0))
            System.out.println("năm " +nam +" là năm nhuận");
        else
            System.out.println("năm " +nam +" không phải là năm nhuận");
    }
}
