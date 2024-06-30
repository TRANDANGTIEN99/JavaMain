package Practice;

import java.util.Scanner;

public class bai12_BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("평균 점수 입력하세요");
        double score = scanner.nextDouble();
        String grade = ((score>=8 && score<10) ? "A" : (score<8 && score>=6.5) ? "B" :
                (score<6.5 && score>=5) ? "C" : "D");
        System.out.println(grade +"입니다");
    }
}
// nếu đúng thực hiện lệnh sau dấu ?
// nếu sai thực hiện lệnh sau dấu :