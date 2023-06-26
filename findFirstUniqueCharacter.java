import java.util.Scanner;

public class findFirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] charCount = new int[26];

        // Step 2: Update character frequencies in charCount
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c - 'a']++;
        }

        // Step 3: Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount[c - 'a'] == 1) {
                return i;
            }
        }

        // Step 4: No non-repeating character found, return -1
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        int index = firstUniqChar(s);
        System.out.println("index of first unique character of the given string:"+index);
    }
}
