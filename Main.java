public class Main {
    public static void main(String[] args)
    {
        int n1=20;
        int n2=32;
        Calculator cal= new Calculator();

        int result = cal.add(n1,n2);
        System.out.println(result);
        System.out.println("Hello World");    
    }
}

class Calculator
{
    public int add(int m,int n)
    {
        int r;
        r=m+n;
        //System.out.println(r);
        return r;
    }
}