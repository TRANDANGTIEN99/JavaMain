package Practice;
// dùng cho trường hợp như hỏi người dùng muốn dừng chương trình không
public class bai15_WhileTrue_VongLap {
    public static void main(String[] args) {
        int n = 0;
        while (true){
            n++;
            System.out.println("n = "+n);
            if (n==9) {
                break;
            }
        }
    }
}
