package com.company;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Student {
    public static void main(String[] args) {

        // importing scanner function
        Scanner sc = new Scanner(System.in);
        // asking end user to input their ID number vai gui
        String IdNumber = JOptionPane.showInputDialog(" Enter your ID number");
        // asking end user to input credit hours in GUI
        String hours = JOptionPane.showInputDialog(" Enter credit hours earned ");
        // asking end user to input course name
        String name = JOptionPane.showInputDialog(" Enter the course name  ");
        // forcing the name of the course to up uppercase
        name = name.toUpperCase(Locale.ROOT);
        // retrieving the Student ID number, credit hours earned, and the name of the course
        JOptionPane.showMessageDialog(null, " The Student ID number is  " + IdNumber + "\n  The credit hour earned is " + hours + "\n The course name is " + name );

        // block of code of the program to create a file
        try {
            // declaring the file
            File myObj;
            // naming the file name
            myObj = new File(" Assignment 7 ");

            // the file name has been created
            if(myObj.createNewFile()) {
                System.out.println(" File has been created: " + myObj.getName());
            }
            // if the file has already been created, print out statement
            else {
                System.out.println(" File has already existed ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}