public class MethodOverloading
{
    public static void main(String[] args) {
        int a=20;
        int b=25;
        int c=94;
        Overloading ov=new Overloading();
        int result=ov.add(a,b,c);
        System.out.println(result);
    }
}


public class Overloading
{
    public int add(int x,int y,int z)
    {
       
        int ad=x+y+x;
        return ad;
    }

}