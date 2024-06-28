package Practice;

import java.util.Scanner;

public class bai10_Scanner {
    public static void main(String[] args) {
        // tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập vào mật khẩu:");// xuất ra câu thôi
        String mk = scanner.nextLine(); // phần được nhập được gán vào mk đây là bước định hình
        System.out.println("mật khẩu là " +mk);// in mk ra

        System.out.println("숫자 입력하세요");
        String numbers = scanner.nextLine();// chú ý: string thì vế sau là Line
        System.out.println("입력한 숫자:" +numbers);

        //int so nguyen
        System.out.println("숫자 입력하세요");
        int numbers1 = scanner.nextInt();// int thì vế sau Int
        System.out.println("입력한 숫자:" +numbers1);

        // float so thuc
        System.out.println(" nhap so thuc ");
        float a = scanner.nextFloat();
        System.out.println("so thuc duoc nhap la" +a);

        System.out.println(" nhap so thuc ");
        byte b = scanner.nextByte();//-128---127
        System.out.println("so thuc duoc nhap la" +b);

    }
}
