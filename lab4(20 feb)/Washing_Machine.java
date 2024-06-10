interface Motor 
{
    double capacity=6.2;
    public void run();
    public void consume();
}
class Washing_Machine implements Motor
{
    public void run()
    {
       // System.out.println("Washing Machine is Running");
    }
    public void consume()
    {
        System.out.println("Consuming Capacity :"+capacity);
    }
    public static void main(String[] args) 
    {
        Washing_Machine obj=new Washing_Machine();
        obj.run();
        obj.consume();
    }
}