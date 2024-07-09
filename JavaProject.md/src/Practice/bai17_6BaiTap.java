package Practice;
//kiểm tra xem có phải số hoàn hảo hay không
public class bai17_6BaiTap {
    public static void main(String[] args) {

        for (int n = 1; n <= 1000; n++) {
        int tong = 0;
        for (int i =1; i<n; i++){
            if(n%i==0)
                tong+=i;
        }
        if(tong==n)
            System.out.println(n+" là số hoàn hảo");
        /*else
            System.out.println(n+" không phải là số hoàn hảo");*/
    }}
}
