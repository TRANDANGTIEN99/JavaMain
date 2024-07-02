package D6;
//사람(Person) 클래스를 만든다.
//이름, 나이 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
//getOld() 메서드를 가지고 있으며, 호출될 시 해당 객체의 나이가 증가한다.
public class  Q_Person {
    private String name;
    private int age;


    public Q_Person(String name, int age) {
                this.name = name;
                this.age = age;

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
            public void getOld() {
                this.age += 1;
            }
            public void printInfo() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
            public static void main(String[] args) {
                Q_Person person = new Q_Person("tien", 25);
                person.printInfo();
                person.getOld();
                person.printInfo();
            }
        }
