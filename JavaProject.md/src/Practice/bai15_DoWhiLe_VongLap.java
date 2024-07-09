package Practice;

public class bai15_DoWhiLe_VongLap {
    public static void main(String[] args) {
        // tinh tong cac so 1den5
        int a = 1;
        int tong = 3;
        do {
            tong += a; //tong = tong + a
            a++;

        } while (a <= 5);
        {
            System.out.println("tong =" + tong);
        }
    }
}
// tính tổng của các giá trị đến khi nàp a=6 thi dừng lại
// ở do while này thực hiện do 1 lần rồi mới kiểm tra điều kiện. ở bài trước while thì nó kiểm tra điều kiện trước
// ví dụ ở trên thay a = 6 thì nó vẫn do cái tong+=a và chạy thì ra kết quả là 9