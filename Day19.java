public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingIndex(String s) {
        int[] charCount = new int[256]; // Assuming ASCII characters
        
        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)] == 1) {
                return i;
            }
        }
        
        return -1; // No non-repeating character found
    }
    
    public static void main(String[] args) {
        String testString = "leetcode";
        int index = firstNonRepeatingIndex(testString);
        if (index != -1) {
            System.out.println("First non-repeating character index: " + index);
            System.out.println("Character: " + testString.charAt(index));
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}
