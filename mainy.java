import java.util.*;

public class mainy {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid
        
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Inner loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
