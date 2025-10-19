// CODE:-

class Vehicle
{
    void drive()
    {
        System.out.println("Driving a car");
    }
}

class Car extends Vehicle
{
    void drive()
    {
        System.out.println("Repairing a car");
    }
}

class Main{
    public static void main(String st[])
    {
        Vehicle obj1 = new Vehicle();
        Car obj2 = new Car();

        obj1.drive();
        obj2.drive();
    }

}
