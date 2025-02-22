/**
 * This was made to illustrate imprecision when using large numbers.
 * @Author Dylan Saly
 * @Version 1.0v
 * @Since 2/22/2025
 */
public class Imprecisions {
    public static void main(String[] args) {
        double x = 12345.6789e200;
        double y = 1 / x;
        double z = x * y;

        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z (x*y) is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
}