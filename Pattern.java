//
//
//
public class Pattern {

    public static void stars(int rows) {
    int i = 1; 
    while (i <= rows) {
        int j = 1; 
        while (j <= (2 * i - 1)) { 
            System.out.print("*");
            j++;
        }
        System.out.println(); 
        i++;
    }
}

  public static void triangle(int rows) {
    int i = 1; 
    while (i <= rows) {
        int j = 1; 
        while (j <= i) {
            System.out.print(i); 
            j++;
        }
        System.out.println(); 
        i++;
    }
}  













public static void main(String[] args) {
        stars(5);
         triangle();
   
    }

}
