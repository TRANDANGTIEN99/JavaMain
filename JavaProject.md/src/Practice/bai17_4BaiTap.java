package Practice;

import java.util.Scanner;

// viết ct tìm những số vừa chia hết cho 3 từ 10 đến 50 hoặc n
public class bai17_4BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số cuối cùng ");
        int n = scanner.nextInt();
        for (int i = 10; i <=n ; i++) {
            if(i%3 ==0)
                System.out.print(i+" ");

        }
    }
}
