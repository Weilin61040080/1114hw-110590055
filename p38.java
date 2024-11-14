import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p38 
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("input string");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str1=br.readLine();

        System.out.println("input search text");

        String str2=br.readLine();
        char ch=str2.charAt(0);

        int num=str1.indexOf(ch);
        
        if(num!=-1)
        {
            System.out.println(str1+"character of"+(num+1)+"is"+ch);
        }
        else
        {
            System.out.println(str1+"do not have"+ch+"text");
        }
    }
}
