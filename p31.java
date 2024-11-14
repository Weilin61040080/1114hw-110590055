public class p31 
{
    public static void main(String[] args) 
    {
        Car.showSum();

        Car car1; 
        car1 = new Car();
        car1.setcar(1234,20.5);

        Car.showSum();
        
        Car car2; 
        car2 = new Car();
        car2.setcar(4567,30.5);
    }
}

class Car 
{
public static int sum=0;
    
    private int num;
    private double gas;

    public Car()
    {
        num=0;
        gas=0.0;
        sum++;
        System.out.println("had a car");
    }
    public void setcar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("number is " + num+"gas is" + gas);
    }
    public static void showSum()
    {
        System.out.println("had"+sum+"cars");
    }
    public void show()
    {
        System.out.println("number is " +num);
        System.out.println("gas is" + gas);
    }
}