package D4.prac.q3;

public class Person {
    private String name;
    private int age;


    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public void sayHello() {
        if (age >= 5) {
            System.out.println(String.format(
                    "Hello, I'm %s", name
            ));

        } else {
            System.out.println("응애응애");
        }
    }

    public int age() {
        age++;
        return age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
}}