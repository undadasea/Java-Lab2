package lab2;

public class Doll implements Toy
{
    double price_;

    Doll(double price)
    {
        price_ = price;
    }

    @Override
    public void play()
    {
        System.out.println("playing doll");
    }

    @Override
    public double getPrice()
    {
        return price_;
    }
}
