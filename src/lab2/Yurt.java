package lab2;

public class Yurt implements House
{
    double price_;

    Yurt(double price)
    {
        price_ = price;
    }

    @Override
    public void live()
    {
        System.out.println("living in yurt");
    }

    @Override
    public double getPrice()
    {
        return price_;
    }
}
