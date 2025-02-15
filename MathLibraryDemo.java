public class MathLibraryDemo {

    public static void main(String[] args) {
        // Power calculation: 2 raised to the power of 3
        double powerResult = Math.pow(2, 3);
        System.out.println("Power: " + powerResult);

        // Square Root calculation: square root of 16
        double sqrtResult = Math.sqrt(16);
        System.out.println("Square Root: " + sqrtResult);

        // Rounding a decimal value: rounding 5.7 to the nearest integer
        long roundedNumber = Math.round(5.7);
        System.out.println("Rounded Number: " + roundedNumber);

        // Generating a random number between 0.0 and 1.0
        double randomNumber = Math.random();
        System.out.println("Random Number: " + randomNumber);
    }
}
