package Practice;

import java.util.Scanner;

// kiểm tra xem có phải số nguyên tố không
// số nguyên tố là số chỉ chia hết cho 1 và chính nó và > 1
public class bai17_7BaiTap_SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(" nhập số nguyên a");
            int a = scanner.nextInt();
            while(a<0){
                System.out.println(" nhập lại số nguyên a vì a phải lớn hơn 0");
                a = scanner.nextInt();
            }
            System.out.println("bạn đã nhập a thành công là "+a);
            int demUoc =0;
            for (int i = 1; i <= a ; i++) {
                if (a%i==0)
                    demUoc++;
            }
            if (demUoc==2)
                System.out.println(a+" là số nguyên tố");
            else
                System.out.println(a+ " không phải là số nguyên tố");

            System.out.println(" bạn có muốn kết thúc không. Bấm Y để thoát");
            String traLoi = new Scanner(System.in).nextLine();
            if (traLoi.equals("y")|| traLoi.equals("Y") )
                break;

        }
    }

}
