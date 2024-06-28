package D4.prac.q3;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        Person person = new Person( " TIEN");
        person.sayHello();
        for (int i=0; i < 10; i++){
            person.age();
            System.out.println(String.format(
                    "you are now, %d years old",
                    person.age()
                    ));
        person.sayHello();
            System.out.println(person.getAge());
            System.out.println(person.getName());
        }}}
