package exercices.java.com.mayezer.bootcamp;

// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número.


import java.awt.desktop.SystemEventListener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("---- Let's look at the multiplication table 1 to 10 ---- \nEnter a number: ");
                int number = scan.nextInt();
                scan.nextLine();

                for (int i = 1; i <= 10 ; i++) {
                    int multiplication = i * number;
                    System.out.printf("%s x %s = %s\n", i, number, multiplication);
                }
                break;

            } catch (InputMismatchException exception) {
                scan.next();
                System.out.println("Enter a valid value!");
                continue;
            }
        }


    }
}
