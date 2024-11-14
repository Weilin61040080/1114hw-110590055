import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p34 
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("input int");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str=br.readLine();

        int num = Integer.parseInt(str);

        System.out.println("input number is "+num);
    }
}
