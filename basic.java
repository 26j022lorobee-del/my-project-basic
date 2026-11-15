public class basic {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The sum using plus() is: " + plus(a, b));
        System.out.println("The difference of " + a + " and " + b + " is: " + minus(a, b));
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b * 2;
    }
}
