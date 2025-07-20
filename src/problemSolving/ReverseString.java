package problemSolving;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello, world!";
        System.out.println("Original string: " + str);
        
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Initialize pointers for swapping
        int start = 0;
        int end = charArray.length - 1;
        
        // Swap characters from both ends until reaching the middle
        while (start < end) {
            // Swap characters
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            // Move pointers
            start++;
            end--;
        }
        
        // Convert the character array back to a string
        String reversedStr = new String(charArray);
        System.out.println("Reversed string: " + reversedStr);
        
        // For Loop
        
        String str2 = "Hello World!";
     // Initialize an empty string to store the reversed string
        String reversed = "";
        // Loop through the characters of the original string from the end to the beginning
        for (int i = str2.length() - 1; i >= 0; i--) {
          // Append each character to the reversed string
          reversed += str2.charAt(i);
        }
        // Return the reversed string
        System.out.println(reversed);
        

	}

}
