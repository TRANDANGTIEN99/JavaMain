package D6;

public class Q_Lecturer {
    private String name;
    private int age;
    private String major;
    private double paper;


    public Q_Lecturer(String name, int age,String major,double paper ) {
        this.name = name;
        this.age = age;
        this.major =major;
        this.paper = paper ;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String name) {
        this.major = major;
    }
    public double getCredit() {
        return paper;
    }
    public void setCredit(double paper) {
        this.paper = paper;
    }
    public void getOld() {
        this.age += 1;
    }
    public void printInfo() {
        System.out.println(name + " - " + major + " (" + paper + ")");
    }
    public static void main(String[] args) {
        Q_Lecturer Lecturer = new Q_Lecturer("tien", 20, "Mechanical engineering", 5);
        Lecturer.printInfo();
    }
}

//강사(Lecturer) 클래스를 만든다.
//이름, 나이 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
//전공, 작성논문 갯수 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
//printInfo() 메서드를 가지고 있으며, 이름, 전공을 <이름>(강사) - <전공>의 형식으로 출력한다.