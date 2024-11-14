import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p40 
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("input string");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str1=br.readLine();

        System.out.println("input test u want add");

        String str2=br.readLine();
        
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);

        System.out.println("form"+str1+"add"+str2+"will become"+sb);
    }
}
