import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class IntParse {
    public static void main(String arcgs[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the integer value");
        String a;
        a = br.readLine();
        int b = Integer.parseInt(a,10);
        System.out.println("Value of " +b+ " in radix 2 is "+ Integer.toBinaryString(b));
        System.out.println("Value of " +b+ " in radix 8 is "+ Integer.toOctalString(b));
        System.out.println("Value of " +b+ " in radix 16 is "+ Integer.toHexString(b));

    }
}
