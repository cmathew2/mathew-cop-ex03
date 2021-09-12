/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;


import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // inputs
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        System.out.print("Who said it? ");
        String author = in.nextLine();

        // output statement + string escapes technique quotes
        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}
