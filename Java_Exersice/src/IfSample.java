public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less then y \n" + x  + " < " + y );

        x = x * 2;
        if(x == y) System.out.println("x is equal y \n" + x  + " = " + y);

        x = x * 2;
        if(x > y) System.out.println("x is greater y \n" + x  + " > " + y);

        if(x == y) System.out.println("we can't see this ");
    }

}
