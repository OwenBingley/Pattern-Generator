// Owen Bingley
// 11/5/2025
// This code uses the loops to print out differnt formats of numbers, charaters, and letters.
public class Pattern {
 
    public static void stars(int rows) {
    int i = 1; 
    while (i <= rows) { // precondition: i is an int and equals 1
        int j = 1;     
        while (j <= (2 * i - 1)) {  // precondition: j is an int and is equal to 1
            System.out.print("*");
            j++;
        }
        System.out.println(); 
        i++;
    } // postcondition: prints the starts out with each line geting two more.
}

  public static void triangle(int rows) {
    int i = 1; 
    while (i <= rows) { // precondition:  i is an int and equals 1
        int j = 1; 
        while (j <= i) { // precondition: j is an int and is equal to 1
            System.out.print(i); 
            j++;
        }
        System.out.println(); 
        i++;
    } // postcondition: prints a tringle from 1 to 9 while adding an exta number in each row.
}
     
    public static void odds(int start) {
        
        for (int i = start; i >= 1; i -= 2) { 
            
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    } // postcondition: prints a triangle from 9 to 1 only including odds and losing 2 9ums from each row.
  
  public static void eo(int maxE) {
    
        for (int i = 1; i <= maxE; i++) {
            
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("O");
                }
            } 
            
            else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("E");
                }
            }
            System.out.println(); 
        }

        
        for (int i = maxE - 1; i >= 1; i--) {
            
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("O");
                }
            } 
            
            else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("E");
                }
            }
            System.out.println(); 
        }
    } // postcondition: starts with o and goes to e after every other until reaches 6 and then decreases.

    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
           
            for (int j = 1; j <= (2 * (rows - i) + 1); j++) {
                System.out.print(i);
            }
            
            System.out.println();
        }
    }

  















 












// tests the code and sets the amount of times to run each statment.
public static void main(String[] args) {
        stars(7);
         triangle(9);
         System.out.println();
         odds(9);
         System.out.println();
         eo(6);
        System.out.println();
         pyramid(5);
        }



}
