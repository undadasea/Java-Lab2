package lab2;

import java.util.Random;

public class Main
{
    public static void fillArray(Thing[] array)
    {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(5);
            switch(number) {
                case 0:
                    array[i] = new Ball(30);
                    break;
                case 1:
                    array[i] = new Cottage(300000);
                    break;
                case 2:
                    array[i] = new Cutlet(150);
                    break;
                case 3:
                    array[i] = new Doll(50);
                    break;
                case 4:
                    array[i] = new Sandwich(80);
                    break;
                case 5:
                    array[i] = new Yurt(150000);
                    break;
            }

        }
    }

    public static void detectFood(Thing[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Food){
                System.out.println("Price: "+array[i].getPrice());
                ((Food)array[i]).eat();
            }
        }
    }

    public static void main(String[] args) {

        try {
            Integer.parseUnsignedInt(args[0]);
        }
        catch (NumberFormatException e){
            System.out.println("Parameter should be a single positive number");
            System.exit(0);
        }

        Thing things[] =  new Thing[Integer.parseInt(args[0])];
        fillArray(things);

        for(int i=0; i<things.length; ++i)
        {
            System.out.println(things[i].getClass().getSimpleName());
        }

        detectFood(things);


    }
}



