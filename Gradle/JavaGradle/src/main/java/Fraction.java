import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {

         // set arg input to ints
         if (args.length == 2) {
            int arg0 = 0;
            int arg1 = 0;
            try {
               arg0 = Integer.parseInt(args[0]);
               arg1 = Integer.parseInt(args[1]);

               // create a new instance
               // Fraction *frac = [[Fraction alloc] init];
               Fraction frac = new Fraction();

               // set the values
               frac.setNumerator(arg0);
               frac.setDenominator(arg1);

               // print it
               System.out.print("The fraction is: ");
               frac.print();
               System.out.println("");

            } catch (Exception e) {
               System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
               System.exit(1);
            }


         } else {
            System.out.println("Exactly 2 arguments should be provided.\n gradle runFraction --args='7 6' or gradle runFrac -Pnum=3 -Pdenom=4");
         }
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}

