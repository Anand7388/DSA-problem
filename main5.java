import java.util.*;

public class main5 {
   public static void main(String args[]) {
       int n = 4;

       // upper part
       for(int i=1; i<=n; i++) {
           // print stars
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }

           // print spaces
           int spaces = 2 * (n-i);
           for(int j=1; j<=spaces; j++) {
               System.out.print(" ");
           }

           // print stars again
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }

           // move to the next line
           System.out.println();
       }

       // lower part
       for(int i=n-1; i>=1; i--) {
           // print stars
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }

           // print spaces
           int spaces = 2 * (n-i);
           for(int j=1; j<=spaces; j++) {
               System.out.print(" ");
           }

           // print stars again
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }

           // move to the next line
           System.out.println();
       }
   }
}


