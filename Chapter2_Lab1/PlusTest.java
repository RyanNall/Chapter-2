
/**
 * Write a description of class PlusTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
                                 //It will be one long line
                                 //correct
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
                                 // 55 will be in the middle of the line
                                 //correct
         System.out.println ("8 plus 5 is " + 8 + 5);
         // it will show as 85
         //correct
         System.out.println ("8 plus 5 is " + (8 + 5));
         //it will correctly add up to 13
         //correct
         System.out.println (8 + 5 + " equals 8 plus 5.");
         //it will show as 85
         //actually shows as 13
        }
}