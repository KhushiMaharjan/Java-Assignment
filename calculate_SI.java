package hw;

import java.util.*;
public class calculate_SI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principle");
        int P = scanner.nextInt();
        Scanner time = new Scanner(System.in);
        System.out.print("Enter time");
        int T = time.nextInt();
        Scanner rate = new Scanner(System.in);
        System.out.print("Enter rate");
        float R = rate.nextFloat();
        float SI=P*T*R/100;
        System.out.println("the simple interest is:"+SI);
    }
}
