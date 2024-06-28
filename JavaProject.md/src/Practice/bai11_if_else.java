package Practice;

import java.util.Scanner;

public class bai11_if_else {
    public static void main(String[] args) {
        // kiểm tra điều kiện nếu đúng thì thực hiện câu lệnh của if
        // nếu sai thì không thực hiện câu lệnh của if
        // nhảy xuống else thực hiện câu lệnh của else
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 점수 입력 ");
        double a = scanner.nextDouble();
        // dieu kien 조건
        if (a>=7.0){
            System.out.println("합격");
            System.out.println("축하한다");}
        else
            System.out.println("불합격");




    }
}
