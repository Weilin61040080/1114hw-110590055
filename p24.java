public class p24 
{
    public static void main(String[] args) 
    {
        Car car1; 
        car1 = new Car();

        car1.setCar(1234,20.5);
        car1.show();

        System.out.println("only change number");
        car1.setCar(2345);
        car1.show();

        System.out.println("only gas number");
        car1.setCar(30.5);
        car1.show();
    }
}

class Car 
{
    private int num;
    private double gas;

    public void setCar(int n)
    {
        num = n;
        System.out.println("let number be"+num);
    }
    public void setCar(double  g)
    {
        gas = g;
        System.out.println("let gas be"+gas);
    }
    public void setCar(int n,double  g)
    {
        num = n;
        gas = g;
        System.out.println("let number be"+num+"let gas be"+gas);
    }
    public void show()
    {
        System.out.println("number is"+this.num);
        System.out.println("gas is"+this.gas);
    }
}