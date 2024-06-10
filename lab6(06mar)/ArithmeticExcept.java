class  ArithmeticExcept
{
    public static void main(String[] args) {
        try{
            int check=17/0;
        }
        catch(ArithmeticException exobj)
        {

        }
        finally
        {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
    }
}