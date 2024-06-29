package Practice;

import java.util.Scanner;

public class bai11_2BaiTap {
    public static void main(String[] args) {
        // viết chương trình nhập chiều cao cân nặng
        // tính chỉ số BMI và xuất thông báo
        //BMI= cân nặng/chiều cao^2
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cân nặng");
        double a = scanner.nextDouble();
        System.out.println("nhập chiều cao");
        double b = scanner.nextDouble();
        double BMI = a / Math.pow(b, 2);
        System.out.println("chỉ số BMI của bạn là " +BMI);

        if (BMI < 15) {
            System.out.println("gầy");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("hơi gầy");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("bình thường");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("hơi béo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("béo");
        }
        else
            System.out.println("quá béo");
    }
}