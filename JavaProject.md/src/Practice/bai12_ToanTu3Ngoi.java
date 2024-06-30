package Practice;

import java.util.Scanner;

public class bai12_ToanTu3Ngoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력하세요");
        int a = scanner.nextInt();
        String traloi = (a%2 ==0) ? "chẵn" : "lẽ";
        System.out.println("số " +a +" là số "+traloi);
    }
}
