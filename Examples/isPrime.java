import java.lang.reflect.WildcardType;
import java.util.Scanner;
class GFG { 
  
    static boolean findPrime(int n) 
    { 
        int tedad = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                tedad++;
            }
        }
        if(tedad==2)
            return true;
        else
            return false;
    } 
    static String isPrimeRange(int l,int o)
    {
        String str = "";
        for(int i=l;i<=o;i++)
        {
            if(findPrime(i))
            {
                str+=" "+i;
            }
        }
        return str;
    }

    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int num2 = sc.nextInt();

        System.out.println(isPrimeRange(num,num2));
        
    } 
} 