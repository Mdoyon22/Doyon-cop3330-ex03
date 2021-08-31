/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input2.nextLine();

        System.out.print(""+ author + " says, " + '"' + quote + '"');
    }
}
