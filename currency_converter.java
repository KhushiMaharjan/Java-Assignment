package hw;

import java.util.*;
public class currency_converter {
    public static void main(String[] args) {
        System.out.println("...menu...");
        System.out.println("1. rupees to USD");
        System.out.println("2. rupees to INR");
        System.out.println("3. rupees to AUS");
        System.out.println("enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("CURRENCY CONVERTER");
        System.out.println("enter the amount in nepali rupees");
        float cur = scanner.nextFloat();
        switch (choice) {
            case 1:
                System.out.println("Rs" + cur + "=" + "$" + (cur / 113.18));
                break;
            case 2:
                System.out.println("NEPALI RS" + cur + "=" + "INDIAN RS" + (cur * 1.60));
                break;
            case 3:
                System.out.println("NEPALI RS" + cur + "=" + "AUS $" + (cur / 86.83));
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
        }
    }