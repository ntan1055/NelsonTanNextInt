package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("What\'s your name? ");
        String name = input.nextLine();
        System.out.println("Hello "+name+", nice to meet you.");
    }
}
