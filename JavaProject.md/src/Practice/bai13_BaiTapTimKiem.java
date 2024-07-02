package Practice;

import java.util.Scanner;
// viết ct người dùng nhập lựa chọn tìm tên , tác giả, nxs, tiêu đề
public class bai13_BaiTapTimKiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời bấm số ");
        System.out.println(" nhấn 1 : tìm tên ");
        System.out.println(" nhấn 2 : tìm tác giả ");
        System.out.println(" nhấn 3 : tìm nhà sản xuất ");
        System.out.println(" nhấn 4 : tìm tiêu đề ");
        int so = scanner.nextInt();

        switch (so){
            case 1:
                System.out.println("tìm tên");
                break;
            case 2:
                System.out.println("tìm tác giả");
                break;
            case 3:
                System.out.println("tìm nhà sản xuất");
                break;
            case 4:
                System.out.println("tìm tiêu đề ");
                break;
            default:
                System.out.println(" số bạn nhập không đúng mời nhập lại");

        }

    }
}
