import java.util.*;
public class mainy {
    public static void main(String[] args) {
        // Example usage:
        int number = 24;
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static boolean isEven(int n) {
        // A number is even if it is divisible by 2 with no remainder
        return n % 2 == 0;
    }
}
