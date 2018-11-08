/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_stringsbenicios8th;

import java.util.Scanner;

/**
 *
 * @author BeanKid
 */
public class JavaApplication_StringsBenicioS8th {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //System.out.println((char)27 + "{36m {ENTER}");

        Scanner input = new Scanner(System.in);
        System.out.println("Hello adventurer, I'm the narrator and here to tell about your tale but first what is your name?");
        String name = input.nextLine();
        String effect = new String("YOU MADE A GOOD CHOICE");

//        System.out.println("Hello " +name);
        Thread.sleep(700);
        System.out.print("H");
        Thread.sleep(350);
        System.out.print("e");
        Thread.sleep(350);
        System.out.print("l");
        Thread.sleep(350);
        System.out.print("l");
        Thread.sleep(350);
        System.out.print("o ");
        Thread.sleep(350);
        System.out.print(name);
        Thread.sleep(350);
        //System.out.println((char)27 + "[37mHello " + name  );
        System.out.println();

        //System.out.println("In a land far far away, evil was wreaking chaos throughout the enchanted kingdom");
        System.out.print("In ");
        Thread.sleep(500);
        System.out.print("a ");
        Thread.sleep(500);
        System.out.print("land ");
        Thread.sleep(500);
        System.out.print("far ");
        Thread.sleep(500);
        System.out.print("far ");
        Thread.sleep(500);
        System.out.print("away, ");
        Thread.sleep(500);
        System.out.print("evil ");
        Thread.sleep(500);
        System.out.print("was ");
        Thread.sleep(500);
        System.out.print("wreaking ");
        Thread.sleep(500);
        System.out.print("chaos ");
        Thread.sleep(500);
        System.out.print("throughout ");
        Thread.sleep(500);
        System.out.print("the ");
        Thread.sleep(500);
        System.out.print("enchanted ");
        Thread.sleep(500);
        System.out.print("kingdom.");
        Thread.sleep(500);
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Oh no a bandit appeared, what do you want to do?");
        Thread.sleep(500);
        System.out.println(" ");
        Thread.sleep(500);
        System.out.println("Do you want to Fight or Run?");//Offers for a choice for the player to choose
        Thread.sleep(500);
        String choice = input.nextLine();
        if (choice.contains("Fight") || choice.contains("fight")) {//First choice that gives a reward for picking
            System.out.println(" ");
            System.out.print("You ");
            Thread.sleep(500);
            System.out.print("beat ");
            Thread.sleep(500);
            System.out.print("up ");
            Thread.sleep(500);
            System.out.print("the ");
            Thread.sleep(500);
            System.out.print("bandit ");
            Thread.sleep(500);
            System.out.print("and ");
            Thread.sleep(500);
            System.out.print("take ");
            Thread.sleep(500);
            System.out.print("his ");
            Thread.sleep(500);
            System.out.print("money ");
            Thread.sleep(500);
            System.out.print(", +10g.");
            Thread.sleep(500);

            int g$ = 10;

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("You start to ");
            Thread.sleep(500);
            System.out.print("continue on your ");
            Thread.sleep(500);
            System.out.print("adventure to the ");
            Thread.sleep(500);
            System.out.print("enchanted kingdom.");
            System.out.println(" ");
            Thread.sleep(500);
            System.out.println(" ");
            Thread.sleep(500);
            System.out.print(name + " ");
            Thread.sleep(500);
            System.out.print((char) 27 + "[31mgained heroics ");
            System.out.println(effect.toLowerCase());
            //System.out.print(name + " gained heroics ");
            Thread.sleep(500);
            
            System.out.print("after his encounter ");
            Thread.sleep(500);
            int h = 1;
            System.out.println(" ");

        } else if (choice.contains("Run") || choice.contains("run")) {//Second choice that results in a negative effect
            System.out.println(" ");
            //System.out.println("You run for your life away from the bandit, hooray...");
            System.out.println(" ");
            System.out.print("You ");
            Thread.sleep(500);
            System.out.print("run ");
            Thread.sleep(500);
            System.out.print("for ");
            Thread.sleep(500);
            System.out.print("your ");
            Thread.sleep(500);
            System.out.print("life ");
            Thread.sleep(500);
            System.out.print("away ");
            Thread.sleep(500);
            System.out.print("from ");
            Thread.sleep(500);
            System.out.print("the ");
            Thread.sleep(500);
            System.out.print("bandit, ");
            Thread.sleep(500);
            System.out.print("hooray...");
            Thread.sleep(500);
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("You start to ");
            Thread.sleep(500);
            System.out.print("continue on your ");
            Thread.sleep(500);
            System.out.print("adventure to the ");
            Thread.sleep(500);
            System.out.print("enchanted kingdom.");
            Thread.sleep(500);
            System.out.println(" ");
            Thread.sleep(500);
            System.out.print(name + " ");
            Thread.sleep(500);
            System.out.print((char) 27 + "[34mgained cowardice ");
            // System.out.print("gained cowardice ");
            Thread.sleep(500);
            System.out.print("after his encounter ");
            Thread.sleep(500);
            int c = 1;
        
        } else if (choice.startsWith("") || choice.startsWith("t")) {//no option that results in game closing
             System.out.println("k ");
             System.exit(0);

        }
        System.out.println(" ");
        System.out.print(name);
        Thread.sleep(500);
        System.out.print(" continues his journey ");
        Thread.sleep(500);
        System.out.print("to the enchanted kingdom. ");
        Thread.sleep(500);
        System.out.print("and starts to ");
        Thread.sleep(500);
        System.out.print("treach through the ");
        Thread.sleep(500);
        System.out.println((char) 27 + "[32mForbidden Forest ");
        Thread.sleep(500);
        System.out.println("to be continued... ");
        Thread.sleep(500);

    }
}
