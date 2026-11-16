package exercices.java.com.mayezer.bootcamp;
/*
* Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar,
* com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
* incluindo os números informados e em ordem decrescente.
*/

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int firtValue = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter a value greater than the first value: ");
        int secondValue = scan.nextInt();
        scan.nextLine();

        System.out.print("Odd or Even [O/E]: ");
        String oddOrEven = scan.nextLine();

        if (oddOrEven.equalsIgnoreCase("O")) {
            for (int i = secondValue; i >= firtValue; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (oddOrEven.equalsIgnoreCase("E")) {
            for (int i = secondValue; i >= firtValue; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid option!");
        }
    }
}
