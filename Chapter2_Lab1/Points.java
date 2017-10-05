
/**
 * Write a description of class Points here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Points
{
        // ------------------------
        // main prints the list
        // ------------------------
        //public static void main (String[] args)
        //{
         //System.out.println ("----------------------------------");
         //System.out.println ("==\tStudent Points\t==");
         //System.out.println ("----------------------------------");
         //System.out.println ("Name\t\tLab\tBonus\tTotal");
         //System.out.println ("----\t\t---\t-----\t-----");
         //System.out.println ("Alexander\t\tWashington\t\tMath");
         //System.out.println ("Ryan\t\tLafayette\t\tEngineering");
         //System.out.println ("\tIssac\t\tLafayette\t\tComputer Science");
         //System.out.println ("\tHurley\t\tConcord\t\tMusic");
         //System.out.println ();
        //}
        public static void main(){
           makeTable(); 
        }
        public static void makeTable() {
            writeHeader();
            populateRows();
        }
        public static void writeHeader() {
         System.out.println ("----------------------------------");
         System.out.println ("==\tStudent Points\t==");
         System.out.println ("----------------------------------");
         System.out.println ("Name\t\tLab\tBonus\tTotal");
         System.out.println ("----\t\t---\t-----\t-----");
        }
        public static void populateRows() {
            populateOneRow("Nall", 50, 5);
            populateOneRow("Issac", 39, 4);
            populateOneRow("Stophe", 37, 8);
            populateOneRow("Ben", 30, 3);
            populateOneRow("Hurls", 10, -5);
        }
        public static void populateOneRow(String name, int lab, int bonus){
            System.out.println(name + "\t\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
        }
}