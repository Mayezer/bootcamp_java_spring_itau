package exercices.java.com.mayezer.bootcamp;

// Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What's your name: ");
        String firstPerson = scan.nextLine();
        System.out.print("What's your age: ");
        int firstAgePerson = scan.nextInt();
        scan.nextLine();

        System.out.println("----------------------------------------------------------");

        System.out.print("What's your name: ");
        String secondPerson = scan.nextLine();
        System.out.print("What's your age: ");
        int secondAgePerson = scan.nextInt();
        scan.nextLine();

        int ageDifference = firstAgePerson - secondAgePerson;

        System.out.printf("\nHello, %s and %s! \nYou have an age difference of: %s", firstPerson, secondPerson, ageDifference);
    }
}
