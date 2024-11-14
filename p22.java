public class p22 
{
    public static void main(String[] args) 
    {
        Car car1; 
        car1 = new Car();

        car1.setNumGas(1234,20.5);
        car1.show();

        System.out.println("test -10");

        car1.setNumGas(1234,-10.0);
        car1.show();
    }
}

class Car 
{
    private int num;
    private double gas;

    public void setNumGas(int n,double g)
    {
        if(g>0&&g<100)
        {
            num=n;
            gas=g;
            System.out.println("let number is"+num+"let gas is"+gas);
        }
        else
        {
            System.out.println(g+"not good");
            System.out.println("cant change");
        }
    }
    public void show()
    {
        System.out.println("number is" + this.num);
        System.out.println("gas is" + this.gas);
    }
}