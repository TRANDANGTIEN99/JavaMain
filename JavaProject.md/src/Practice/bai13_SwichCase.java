package Practice;

import java.util.Scanner;

public class bai13_SwichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập 1 số nguyên :");
        int a = scanner.nextInt();
        int div = a%2;

        switch (div){
            case 0:
                System.out.println(a +" là số chẵn");
                break;// phải có break nếu không nó sẽ in ra luôn cả hai trường hợp
            default:
                System.out.println(a +" là số lẽ");
        }

    }
}
