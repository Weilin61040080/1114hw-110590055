public class p9 
{
    public static void main(String[] args) 
    {
        Car car1; 
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;
    }
}

class Car 
{
    int num;
    double gas;
    
    void show()
    {
        System.out.println("car1 number：" + this.num);
        System.out.println("gas：" + this.gas);
    }
    
}