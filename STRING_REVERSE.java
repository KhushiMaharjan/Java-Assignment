package hw;

import java.util.*;
public class STRING_REVERSE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String ch = scanner.nextLine();
        System.out.print("Original word: "+ch);
        String nch="";
        for (int i = ch.length() - 1; i >= 0; i--) {
            nch += ch.charAt(i);
        }
        System.out.println("Reversed String: " + nch);
    }
}

