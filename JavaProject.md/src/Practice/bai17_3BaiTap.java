package Practice;

import java.util.Scanner;

// nhập n tính tổng các số lẻ từ 1 đến n
// bỏ qua 3======= tổng là 16
// thử break khi chạy đến 3
public class bai17_3BaiTap {

    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số nguyên n");
         n = scanner.nextInt();

        if (n%2 !=0){
            for (int i = 1; i<=n; i+=2) {
                System.out.println(i);
                tong+=i;

                }
            }System.out.println("tổng các số lẻ 1 đến " +n +" là "+tong);
        }


    }
//continue//// break
//for (int i = 1; i<=n; i+=2) {
//                if(i==3)
//                continue; vẫn tính các số lẻ nhưng bỏ qua giá trị trong if là 3 nên giá trị sẽ là 16-3= 13
//                tong+=i; ở đây nếu thay continue bằng break thì kết quả bằng 1 vì nếu gặp 3 thì chỉ còn giá trị 1
//                }
//            }System.out.println("tổng các số lẻ 1 đến " +n +" là "+tong);
//        }