package exercices.java.com.mayezer.bootcamp;

/*
* Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
* a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
* números menores que o primeiro número devem ser ignorados.
*/

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = scan.nextInt();

        while (true) {
            System.out.print("Provide the next number: ");
            int secondNumber = scan.nextInt();

            if (secondNumber < firstNumber) {
                continue;
            } else if (secondNumber % firstNumber != 0) {
                System.out.println("The last number has a remainder other than 0 when divided!");
                break;
            }
        }
    }
}
