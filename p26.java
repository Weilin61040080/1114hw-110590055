public class p26 
{
    public static void main(String[] args) 
    {
        Car car1; 
        car1 = new Car();

        car1.show();
    }
}

class Car 
{
    private int num;
    private double gas;

    public Car()
    {
        num=0;
        gas=0.0;
        System.out.println("had a car");
    }
    public void show()
    {
        System.out.println("number is " +num);
        System.out.println("gas is" + gas);
    }
}