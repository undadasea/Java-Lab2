package lab2;

public class Cottage implements House
{
    double price_;

    Cottage(double price)
    {
        price_ = price;
    }

    @Override
    public void live()
    {
        System.out.println("living in cottage");
    }

    @Override
    public double getPrice()
    {
        return price_;
    }
}
