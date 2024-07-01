package D6;

public class Main {
    public static void main(String[] args) {
        Truck porter = new Truck("poster");
        System.out.println(porter.getFuel());
        porter.drive(10);
        System.out.println(porter.getFuel());
        Car sonata = new Car("sonata");
        System.out.println(sonata.getFuel());
        System.out.println(sonata.getName());
        sonata.drive(50);
        System.out.println(sonata.getFuel());

        porter.beep();
        sonata.beep();
        Car optimus = new Truck( "Optimus Rtime");
        System.out.println(String.format(
                "my name is &s" ,
                optimus.getName()
        ));
        refuel(sonata);
        refuel(porter);
        refuel(optimus);
        System.out.println(porter.getFuel());

    }
    public static void refuel(Car car) {
        car.setFuel(100);
    }
}
