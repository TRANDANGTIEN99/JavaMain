package Practice;

public class bai16_for_VongLap {
    public static void main(String[] args) {


       for (int i = 0; i <= 10; i+=2) {// xuất các số chẵn từ 0 đến 10
          System.out.println("i="+i);
        }


        int tong= 0;
        for (int i = 0; i <= 10; i++) {// tính tổng các số chẵn từ 0 đến 10
           tong+= i;}
           System.out.println("tong=" +tong);
    }

}
