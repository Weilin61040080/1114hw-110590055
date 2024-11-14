public class p17 
{
    public static void main(String[] args) 
    {
        Car car1; 
        car1 = new Car();
        car1.setnumgas(1234,20.5);
        int number=car1.getNum();
        double gasonline = car1.getGas();

        System.out.println("Investigate the sample key and find out");
        System.out.println("number is"+number+"gas is"+gasonline);
    }
}

class Car 
{
    int num;
    double gas;
    
    int getNum()
    {
        System.out.println("investigation number");
        return num;
    }
    double getGas()
    {
        System.out.println("investigation gas");
        return gas;
    }

    void setnumgas(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("let number be：" + num +"let gas be" + gas );
    }  
}