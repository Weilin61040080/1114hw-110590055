public class p28 
{
    public static void main(String[] args) 
    {
        Car car1; 
        car1 = new Car();
        car1.show();

        Car car2;
        car2= new Car(1234,25.0);
        car2.show();
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
    public Car(int n,double g)
    {
        this();
        num = n;
        gas = g;
        System.out.println("number is " + num+"gas is " + gas);
    }
    public void show()
    {
        System.out.println("number is " +num);
        System.out.println("gas is" + gas);
    }
}