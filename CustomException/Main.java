class MihaiException extends Exception
{
    public MihaiException(String string)
    {
        super(string);
    }
}

public class Main 
{
    public static void main(String a[])
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
                throw new MihaiException("Dont display 0");
        }
        catch(MihaiException e)
        {
            j = 18/1;
            System.out.println("default output" + e);
        }
        catch(Exception e) {
            System.out.println("Smt wrong" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
            
    }
}


