package hw;

import java.util.*;
public class vowel_or_consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
       // System.out.println(ch.toLowerCase());
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U') {
            System.out.println("the given character is vowel");
        }
        else {
            System.out.println("the given character is consonant");
        }
    }
}
