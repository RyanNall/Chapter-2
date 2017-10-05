
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 import java.util.Scanner;
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length;
            int width;
            int height;
            //Define integers door and window
            int door;
            int window;
            //Initialize door and window
            door = 1;
            window = 2;
         
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
            //Declare and initialize the length of the room
            length = 15;
 
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = (length * width) + 2 * (width * height) + 2 * (length * height) - (20 * door + 15 * window);
 
            //Compute the amount of paint needed
            paintNeeded = totalSqFt / 350;
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println ("Length of room is: " + length);
            System.out.println ("Width of room is: " + width);
            System.out.println ("Height of room is: " + height);
            System.out.println ("You need " + paintNeeded + " gallons of paint");
            
        }
}