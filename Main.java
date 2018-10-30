public class Main
{
    public static void main(String[]args)
    {
    }
    
    public static int factorial(int n)
    {
        System .out.println("DEBUG "+n);
        
        if (n<=1)
            return 1;
            
            return factorial(n-1);
    }
}