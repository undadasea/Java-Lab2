package lab2;

public class Cutlet implements Food
{
    double price_;

    Cutlet(double price)
    {
        price_ = price;
    }

    @Override
    public void eat()
    {
        System.out.println("eating cutlet");
    }

    @Override
    public double getPrice()
    {
        return price_;
    }
}
