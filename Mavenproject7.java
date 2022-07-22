class Even implements Runnable{
    @Override
    public void run()
    {
        try{
        for(int i=0;i<=20;i=i+2)
        {
            Thread.sleep(1200);
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Odd implements Runnable{
    @Override
    public void run()
   {
        try{
        for(int i=1;i<=20;i=i+2)
        {
            Thread.sleep(1300);
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Mavenproject7
{

    public static void main(String[] args)
    {
        Even E = new Even();
        Odd O = new Odd();
        Thread t1 = new Thread(E);
        Thread t2 = new Thread(O);
        t1.start();
        t2.start();
    }
}
