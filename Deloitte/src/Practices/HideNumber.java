package Practices;

public class HideNumber {
    public static String hideMiddleDigits(String telephoneNumber) {
        if (telephoneNumber == null || telephoneNumber.length() != 10) {
            throw new IllegalArgumentException("Mobile number must be exactly 10 digits.");
        }
        String masktelephoneNumber = telephoneNumber.substring(0, 4) + "*****" + telephoneNumber.substring(8);
        return masktelephoneNumber;
    }
    public static void main(String[] args) {
        String originalNumber = "7327042194";
        String maskedNumber = hideMiddleDigits(originalNumber);
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Masked Number: " + maskedNumber);
    }
}



