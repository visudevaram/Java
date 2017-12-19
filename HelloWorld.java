import java.io.*;

public class HelloWorld
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c, d;
        System.out.println("Enter the name :");
        a = br.readLine();
        System.out.println("Enter the address :");
        b = br.readLine();
        System.out.println("Enter the age :");
        c = br.readLine();
        System.out.println("Enter the gender :");
        d = br.readLine();
        System.out.println("Name - " + a);
        System.out.println("Address - " + b);
        System.out.println("Age - " + c);
        System.out.println("Gender - " + d);
    }
}
