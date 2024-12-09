package InterviewPrograms;

public class StringReverse {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = "";

        // Using a for loop to reverse the string
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
