
/**
 * Richard Bensics 
 * 3/21/16
 */
public class Program
{
    public static void main(String args[])
    {
        int fib = 0, sum = 0;
        
        for(int i = 0; i < Integer.MAX_VALUE; i++)
        {
            if( ( (fib = Fibonacci(i)) % 2 == 0) && fib < 4000000)
                sum += fib;
            if( fib > 4000000)
                break;
        }
        
        System.out.println(sum);
    }
    
    public static int Fibonacci(int n)
    {
        if(n <= 1)
            return n;
        else
            return (Fibonacci(n-1) + Fibonacci(n-2));
    }
}
