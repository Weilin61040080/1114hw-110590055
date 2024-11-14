public class p45 
{
    public static void main(String[] args) {

        System.out.println("declare car1");

        Car car1=new Car();
        car1.setcar(1234, 20.5);

        System.out.println("declare car2");
        Car car2;

        System.out.println("let car1 to car2");
        car2=car1;

        System.out.println("car1s");
        car1.show();
        
        System.out.println("car2");
        car2.show();

        System.out.println("change car1 data");
        car1.setcar(2345, 30.5);
        
        System.out.println("car1s");
        car1.show();
        
        System.out.println("car2s");
        car2.show();

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
        System.out.println("had a car");
    }
    public void setcar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("number is" + num+"gas is" + gas);
    }
    public void show()
    {
        System.out.println("number is " +num);
        System.out.println("gas is" + gas);
    }
}