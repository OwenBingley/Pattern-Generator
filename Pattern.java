// Owen Bingley
// 11/5/2025
// This code uses loops to print out different formats of numbers, characters, and letters.

public class Pattern {

    // Preconditions:
    // rows >= 1
    // Postconditions:
    // Produces rows lines of stars, with each line i containing (2*i - 1) stars.
    public static void stars(int rows) {

        int i = 1; 
        // Precondition: i starts at 1 and will advance toward rows.
        while (i <= rows) {

            int j = 1;
            // Precondition: j starts at 1 and will move upward until the star count is met.
            while (j <= (2 * i - 1)) {
                // Precondition: j is within the star-printing range.
                System.out.print("*");
                j = j + 1;  
                // Postcondition of this iteration: j now refers to the next position in the row.
            }
            // Postcondition: printed exactly (2*i - 1) stars on this line.

            System.out.println();
            i = i + 1;
            // Postcondition: the next line will use the next value of i.
        }
        // Postcondition: printed a star pattern that grows by two stars per line.
    }


    // Preconditions:
    // rows >= 1
    // Postconditions:
    // Produces a left-aligned numeric triangle where line i displays the number i, i times.
    public static void triangle(int rows) {

        int i = 1;
        // Precondition: i starts at 1.
        while (i <= rows) {

            int j = 1;
            // Precondition: j starts at 1.
            while (j <= i) {
                // Precondition: j is within the printing range of line i.
                System.out.print(i);
                j = j + 1;
                // Postcondition of this printing step: j now refers to the next position in the row.
            }
            // Postcondition: printed i copies of i.

            System.out.println();
            i = i + 1;
            // Postcondition: the next line uses the next value of i.
        }
        // Postcondition: printed a numeric triangle from 1 to rows.
    }


    // Preconditions:
    // start is a positive odd integer.
    // Postconditions:
    // Prints descending rows where each row displays an odd number i repeated i times,
    // progressing from start down to 1.
    public static void odds(int start) {

        for (int i = start; i >= 1; i = i - 2) {
            // Precondition: i begins as an odd value and decreases by 2 each cycle.

            for (int j = 0; j < i; j = j + 1) {
                // Precondition: j marks each position to print the value i.
                System.out.print(i);
                // Postcondition of one print step: j moves to the next position.
            }
            // Postcondition: printed i copies of i.

            System.out.println();
        }
        // Postcondition: produced a triangle of descending odd numbers.
    }


    // Preconditions:
    // maxE >= 1
    // Postconditions:
    // Prints an increasing then decreasing pattern.
    // Odd rows print 'O'; even rows print 'E'. Row length matches the row number.
    public static void eo(int maxE) {

        for (int i = 1; i <= maxE; i = i + 1) {
            // Precondition: i moves upward from 1 to maxE.

            if (i % 2 != 0) {
                // Precondition: i is odd.
                for (int j = 1; j <= i; j = j + 1) {
                    System.out.print("O");
                }
            } else {
                // Precondition: i is even.
                for (int j = 1; j <= i; j = j + 1) {
                    System.out.print("E");
                }
            }
            // Postcondition: completed the row for this value of i.

            System.out.println();
        }

        // Precondition: second half reduces from maxE - 1 to 1.
        for (int i = maxE - 1; i >= 1; i = i - 1) {

            if (i % 2 != 0) {
                for (int j = 1; j <= i; j = j + 1) {
                    System.out.print("O");
                }
            } else {
                for (int j = 1; j <= i; j = j + 1) {
                    System.out.print("E");
                }
            }
            // Postcondition: completed a decreasing row.

            System.out.println();
        }
        // Postcondition: produced a full pattern that grows and then shrinks in length.
    }


    // Preconditions:
    // rows >= 1
    // Postconditions:
    // Produces a numeric pyramid that becomes narrower each line, centered by spaces.
    public static void pyramid(int rows) {

        for (int i = 1; i <= rows; i = i + 1) {
            // Precondition: i moves upward from 1 to rows.

            for (int j = 1; j < i; j = j + 1) {
                // Precondition: j is the number of spaces infont.
                System.out.print(" ");
            }
            // Postcondition: add spaces in front

            for (int j = 1; j <= (2 * (rows - i) + 1); j = j + 1) {
                // Precondition: j controls the width of the pyramid row.
                System.out.print(i);
            }
            // Postcondition: printed the main content of the line.

            System.out.println();
        }
        // Postcondition: completed an numeric pyramid.
    }



    // Preconditions:
    // the cod for each statment like for example stars.
    // Postconditions:
    // prints all pattern printing methods.
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
