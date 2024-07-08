public class mainy {
    public static void main(String[] args) {
        int size = 7; 
        
        
        for (int i = 0; i < size; i++) {
            
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            
            
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < size - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
