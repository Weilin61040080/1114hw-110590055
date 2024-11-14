public class p51 
{
    public static void main(String[] args) 
    {
        Car[] car1;
        car1=new Car[3];

        for(int i=0;i<car1.length;i++)
        {
            car1[i]=new Car();
        }
        car1[0].setCar(1234,20.5);
        car1[1].setCar(2345,30.5);
        car1[2].setCar(3456,40.5);

        for(int i=0;i<car1.length;i++)
        {
            car1[i].show();
        }
    }
}

class Car 
{
    int num;
    double gas;

    public Car()
    {
        num=0;
        gas=0.0;
        System.out.println("had a car");
    }
    public void setCar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("number be" + num+"gas be" + gas);
    }

    public void show()
    {
        System.out.println("number is"+num);
        System.out.println("gsa is"+gas);
    }
}