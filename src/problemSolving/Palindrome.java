package problemSolving;

public class Palindrome {

	public static void main(String[] args) {
// For Loop
        
        String str2 = "Racecar";
     // Initialize an empty string to store the reversed string
        String newStr = str2.toLowerCase();
        String reversed = "";
        // Loop through the characters of the original string from the end to the beginning
        for (int i = newStr.length() - 1; i >= 0; i--) {
          // Append each character to the reversed string
          reversed += newStr.charAt(i);
        }
        // Return the reversed string
        System.out.println(reversed);
        if(newStr.equals(reversed)) {
        	System.out.println("is Palindrome");
        }else {
        	System.out.println("is not palindrome");
        }

	}

}
