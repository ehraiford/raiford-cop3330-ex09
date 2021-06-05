/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package ex09;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        final int coverageFT = 350;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the ceiling length? ");
        double length = in.nextDouble();
        System.out.print("What is the ceiling width? ");
        double width = in.nextDouble();

        double dGallons = (length * width) / coverageFT;
        dGallons = Math.ceil(dGallons);
        int iGallons = (int)dGallons, area = (int)(length * width);
        System.out.println("You will need to purchase " + iGallons + " gallons of paint to cover " + area + " feet.");
        }
    }
