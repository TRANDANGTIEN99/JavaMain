package Practice;
// nếu dùng excel thì dễ hiểu hơn
// lồng nhau có hai ví dụ bên dưới
public class bai18_ForLongNhau {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                /*System.out.println(i);
                System.out.println(j);*/
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println();
        System.out.println();
// vẽ chữ n
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == j)
                 System.out.print(i+""+j+"\t");
                else
                    System.out.print(""+"\t");
            } System.out.println("");
        }
        System.out.println();
        System.out.println();
        System.out.println();
// vẽ hình vuông
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == 1 || i==7)
                    System.out.print(i+""+j+"\t");
                else
                    System.out.print(""+"\t");
            } System.out.println("");
        }
        System.out.println();
        System.out.println();
        System.out.println();
// vẽ hình tam giác
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(i+""+j+"\t");

            } System.out.println("");
        }
    }


}