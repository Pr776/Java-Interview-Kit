package Practices;

public class RemoveSpecialCharcter {
    public static void main(String[] args) {

        String str="$j#@a!^va&*";
        String result=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("After removing special charcter:\n"+ result);

    }
}
