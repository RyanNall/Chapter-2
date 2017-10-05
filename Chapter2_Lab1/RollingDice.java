
/**
 * Write a description of class RollingDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class RollingDice
{
    public static void main (String [] args)
    {
        Random generator = new Random();
        int dieRoll1;
        int dieRoll2;
        
        dieRoll1 = generator.nextInt(7);
        dieRoll2 = generator.nextInt(7);
        
        System.out.println("Die 1 rolled a: " + dieRoll1);
        System.out.println("Die 2 rolled a: " + dieRoll2);
        
        System.out.println("The total sum of the roll is: " + (dieRoll1 + dieRoll2)); 
    }
}