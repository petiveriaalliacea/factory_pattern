package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the sneakers you want: \n" +
                            "1. Nike" +"\n"+
                            "2. Adidas");

        int choice = scanner.nextInt();
        SneakersFactory factory;

        if(choice == 1) {
            factory = new NikeSneakersFactory();
            Sneakers sneakers = factory.createSneakers();
            sneakers.slogan();
        }
        else if (choice == 2) {
            factory = new AdidasSneakersFactory();
            Sneakers sneakers = factory.createSneakers();
            sneakers.slogan();
        }
        else {
            System.out.println("Error! Choose correct brand!");

        }


//        SneakersFactory factory;
//        factory = new NikeSneakersFactory();
//        Sneakers sneakers = factory.createSneakers();
//        sneakers.slogan();



    }
}
