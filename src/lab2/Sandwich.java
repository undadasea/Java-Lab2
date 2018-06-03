package lab2;

public class Sandwich implements Food
{
    double price_;

    Sandwich(double price)
    {
        price_ = price;
    }

    @Override
    public void eat()
    {
        System.out.println("eating sandwich");
    }

    @Override
    public double getPrice()
    {
        return price_;
    }
}
