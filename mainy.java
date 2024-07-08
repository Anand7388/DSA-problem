import java.util.*;

public class mainy {
    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's Triangle
        
        // Iterate through each row
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Calculate and print values for each row
            int num = 1; // Initialize first element of each row to 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            
            System.out.println();
        }
    }
}
