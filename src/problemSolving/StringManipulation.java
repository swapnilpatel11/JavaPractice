package problemSolving;

public class StringManipulation {
	
	    public static void main(String[] args) {
	        // Example usage:
	        String input = "hello";
	        
	        // Reverse a string
	        String reversedString = reverseString(input);
	        System.out.println("Reversed: " + reversedString);

	        // Check if a string is a palindrome
	        boolean isPalindrome = isPalindrome(input);
	        System.out.println("Is Palindrome: " + isPalindrome);

	        // Convert to uppercase
	        String uppercaseString = toUpperCase(input);
	        System.out.println("Uppercase: " + uppercaseString);

	        // Convert to lowercase
	        String lowercaseString = toLowerCase(input);
	        System.out.println("Lowercase: " + lowercaseString);
	    }

	    public static String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder(input);
	        return reversed.reverse().toString();
	    }

	    public static boolean isPalindrome(String input) {
	        String reversed = reverseString(input);
	        return input.equalsIgnoreCase(reversed);
	    }

	    public static String toUpperCase(String input) {
	        return input.toUpperCase();
	    }

	    public static String toLowerCase(String input) {
	        return input.toLowerCase();
	    }
	

}
