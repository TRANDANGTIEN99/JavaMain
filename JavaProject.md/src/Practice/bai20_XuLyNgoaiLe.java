package Practice;
//// với bài này thì trong try k đúng nên cần xử ký ngoại lệ và k tính c , nên nó thực hiện bước trong catch
// in ra là có lỗi
public class bai20_XuLyNgoaiLe {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(" có lỗi ");
            System.out.println(e);// in e
            e.printStackTrace();// in lỗi e
        }

        System.out.println(" đoạn code phía sau nữa.......");
    }

}
