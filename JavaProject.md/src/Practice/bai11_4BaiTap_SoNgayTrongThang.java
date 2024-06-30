package Practice;

import java.util.Scanner;

public class bai11_4BaiTap_SoNgayTrongThang {
    public static void main(String[] args) {
        //nhâp số tháng trả lại kết qủa tháng ấy có bao nhiêu ngày
        // nêsu là tháng 2 thì thêm đk là năm nào
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng dương lịch ");
        int thang = scanner.nextInt();

        if(thang==1 || thang==3 || thang==5 || thang==7 || thang==8 || thang==10 || thang==12 ){
            System.out.println("tháng " + thang+" có 31 ngày");
        }
        else if (thang==4 || thang==6 || thang==9 || thang==12 ) {
            System.out.println("tháng " +thang+" có 30 ngày");
        }
        else if (thang>12) {
            System.out.println("một năm chỉ có 12 tháng. kiểm tra lại");
        }
        else if (thang==2) {
            System.out.println("để kiểm tra có phải năm nhuận hay không hãy nhập số năm");
            int nam = scanner.nextInt();
            if (((nam%4==0) && (nam%100!=0)) ||(nam %400==0)){
                System.out.println("năm " +nam +" là năm nhuận");
                System.out.println("tháng " +thang+" có 29 ngày");
        }
            else{
                System.out.println("năm " +nam +" không phải là năm nhuận");
                System.out.println("tháng " +thang+" có 28 ngày");
    }
        }

    }
}
