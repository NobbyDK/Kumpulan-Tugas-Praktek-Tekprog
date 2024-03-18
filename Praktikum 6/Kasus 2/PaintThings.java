//*****************************************************************
//  PaintThings.java
//
//  Computes the amount of paint needed to paint various
//  things. Uses the amount method of the paint class which
//  takes any Shape as a parameter.
//*****************************************************************
import java.text.DecimalFormat;

public class PaintThings 
{
    //--------------------------------------------------------------------------
    //  Creates some shapes and a paint object
    //  and prints the amount of paint needed
    //  to paint each shape.
    //--------------------------------------------------------------------------
    public static void main(String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        //instantiate the three shapes to paint
        Rectangle deck = new Rectangle(35,20);
        Sphere bigball = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        //compute the amount of paint needed for each shape
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigball);
        double tankAmt = paint.amount(tank);

        //Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
