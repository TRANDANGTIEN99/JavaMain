package Practice;
// viết ct tính tổng giai thừa 1! + 2! ... + 10!
public class bai17_5BaiTap_TongS_GiaiThua {
    public static void main(String[] args) {
        int m = 1;
        int tong = 0;
        for (int i = 1; i <=10 ; i++) {
            m=i*m; // m*=i
            tong+=m;
        } System.out.println(tong);
    }

}
