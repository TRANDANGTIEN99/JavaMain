package D6;
//학생(Student) 클래스를 만든다.
//이름, 나이 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
//전공, 학점 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
//printInfo() 메서드를 가지고 있으며, 이름, 전공, 학점을 <이름> - <전공> (<학점>)의 형식으로 출력한다.
public class Q_Student  {
    private String name;
    private int age;
    private String major;
    private double credit;


    public Q_Student(String name, int age,String major,double credit ) {
        this.name = name;
        this.age = age;
        this.major =major;
        this.credit = credit;

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
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public void getOld() {
        this.age += 1;
    }
    public void printInfo() {
        System.out.println(name + " - " + major + " (" + credit + ")");
    }
    public static void main(String[] args) {
        Q_Student student = new Q_Student("tien", 20, "Mechanical engineering", 3.8);
        student.printInfo();
    }
}

//학생(Student) 클래스를 만든다.
//이름, 나이 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
//전공, 학점 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
//printInfo() 메서드를 가지고 있으며, 이름, 전공, 학점을 <이름> - <전공> (<학점>)의 형식으로 출력한다.