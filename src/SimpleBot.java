/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 23-08-2020
 *   Time: 18:05
 *   File: SimpleBot.java
 */
//package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    /*
     * This method displays the name of the assistant
     * @param assistantName:This parameter represents the name of the assistant.
     * @param birthYear:This parameter represents the birth year i.e year of creation of the box.
     */
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    /*
     * This method asks the user to input their name so that the box could identify them.
     */
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    /*
     * This method asks the user to input the remainders of dividing their age by 3,5,7 so that the box could calculate their age.
     */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    /*
     * This methods prints the numbers from 0 to number-1 where number is the number inputed by the user.
     */
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    /*
     * This method displays the question to the user along with the series of all the multiple choice options.
     */
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int answer = scanner.nextInt();
        while (answer != 2) {
            System.out.println("Please, try again.");
        }//Here the correct answer is 2

    }

    /*
     * This is the last method(end) which congratulates the user upon their completion of quiz by giving the correct answer.
     */
    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
