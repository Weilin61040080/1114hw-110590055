public class p47 
{
    public static void main(String[] args) {

        
        Car car1;
        car1=new Car();

        car1.show();

        int number=1234;
        double gasonline=20.5;
        String str="car numer 1";

        car1.setCar(number,gasonline);
        car1.setName(str);

        car1.show();
    }
}

class Car 
{
    private int num;
    private double gas;
    private String name;

    public Car()
    {
        num=0;
        gas=0.0;
        name="no name";
        System.out.println("had a car");
    }
    public void setCar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("let number be" + num+"gas be" + gas);
    }

    public void setName(String nm)
    {
        name=nm;
        System.out.println("let car name"+name);
    }
    public void show()
    {
        System.out.println("number is "+num);
        System.out.println("gas is "+gas);
        System.out.println("car name is"+name);
    }
}