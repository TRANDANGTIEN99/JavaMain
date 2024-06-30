package Practice;

import java.util.Scanner;

public class bai13_SwichCase_DemNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số tháng muốn kiểm trả");
        int thang = scanner.nextInt();
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " +thang +" có 31 ngày");
                break;
            case 6:
            case 4:
            case 11:
            case 9:
                System.out.println("tháng " +thang +" có 30 ngày");
                break;
            case 2:
                System.out.println("tháng " +thang +" có 28 ngày hoặc 29 ngày");
                break;
            default:
                System.out.println("kiểm tra lại số tháng đã nhập");
        }
    }
}
