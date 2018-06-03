package lab2;

public class Ball implements Toy
{
    double price_;

    Ball(double price)
    {
        price_ = price;
    }

    @Override
    public void play()
    {
        System.out.println("playing ball");
    }

    @Override
    public double getPrice()
    {
        return price_;
    }
}
