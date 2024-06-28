package Practice;

import java.util.Scanner;

public class bai11_if_else_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입수입력하세요");
        double a = scanner.nextDouble();

        if(a<=10 && a>=8){
            System.out.println("A");}
        else if (a>= 6.5 && a<= 8) {
            System.out.println("B");
        } else if (a>10) {
            System.out.println(" 점수 다시 확인하세요");


        } else        // else if (a<6.5)
        {
            System.out.println("C");}
    }
}
