import java.util.*;
import java.io.*;

public class CountAlphabet {
    public static void main(String[] args) throws Exception {
        Scanner consoleInput = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = consoleInput.nextLine();

        File file = new File(filename);
        Scanner fileInput = new Scanner(file);
        
        int[] count = new int[26];
        while(fileInput.hasNextLine()) {
          String line = fileInput.nextLine();
          for (int i=0; i<line.length(); i++) {
            int ch = line.charAt(i);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
              count[Character.toLowerCase(ch) - 'a']++;
            }
          }
        }

        for(int i=0; i<26; i++) {
          System.out.println("The occurrence of " + (char)('A' + i) + "\'s is " + count[i]);
        }
    }
}