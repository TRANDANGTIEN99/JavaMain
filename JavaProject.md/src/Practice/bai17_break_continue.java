package Practice;

public class bai17_break_continue {
    public static void main(String[] args) {
        // tính tổng các số từ 1 đến 5 bỏ qua số 3
        int tong = 0;
        for (int i = 0; i <=5; i++) {
            if(i==3) {
                continue;// gặp continue thì nó quay nó bỏ đi cái trong if thực hiện lại 조건식이나 증감식으로 돌아간다
                }
                else
                tong += i;
        }
        System.out.println("tong= " +tong); // 15 - 3 = 12

        // break
        System.out.println(" tổng =" +tong);
        int n = 0;
        while (n<100){
            System.out.println("n= " +n);
            if (n==15)
                break;
            n++;
        }
    }
}
