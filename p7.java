public class p7
{
    public static void main(String[] args) 
    {
        Car car1; 
        car1 = new Car();
        
        car1.num = 1234;
        car1.gas = 20.5;

        Car car2;
        car2 = new Car();

        car2.num = 2345;
        car2.gas = 30.5;

        ystem.out.println("car1 number：" + car1.num);
        System.out.println("gas：" + car1.gas);

        ystem.out.println("car2 number：" + car2.num);
        System.out.println("gas：" + car2.gas);
    }
}

class Car 
{
    int num;
    double gas;
}