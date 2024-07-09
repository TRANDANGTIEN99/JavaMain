package Practice;
// với bài này thì trong try đúng k cần xử ký ngoại lệ nên nó tính c và không thực hiện bước trong catch
public class bai20_1XuLyNgoaiLe {
    public static void main(String[] args) {
    int a = 10;
    int b = 5;

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

