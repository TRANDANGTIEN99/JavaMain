package Practice;

public class bai6_epkieudulieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq1 = a/b;
        System.out.println(kq1);
        double kq2 = (double)a/b;
        System.out.println(kq2);//int >> double

        //ep kieu hep
        int c = 128;
        byte d =(byte) c;
        System.out.println(c);
        System.out.println(d);// d phai bang c nhung ma ep sang kieu hep nen d=-128 , co the mat du lieu
    }
}
