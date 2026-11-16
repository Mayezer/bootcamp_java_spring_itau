package exercices.java.com.mayezer.bootcamp;

// Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos".

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What's your name: ");
        String name = scan.nextLine();

        System.out.print("What's your age: ");
        int age = scan.nextInt();

        System.out.printf("\nHello %s, you have %s years old!", name, age);
    }
}
