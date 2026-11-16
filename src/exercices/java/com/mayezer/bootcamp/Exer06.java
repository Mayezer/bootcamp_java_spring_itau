package exercices.java.com.mayezer.bootcamp;

/*
* Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

* Se for menor ou igual a 18,5 "Abaixo do peso";
* se for entre 18,6 e 24,9 "Peso ideal";
* Se for entre 25,0 e 29,9 "Levemente acima do peso";
* Se for entre 30,0 e 34,9 "Obesidade Grau I";
* Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
* Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("=== LET'S CALCULATE YOUR BMI === \nEnter your height: ");
                double height = scan.nextDouble();
                scan.nextLine();

                System.out.print("Enter your weight: ");
                double weight = scan.nextDouble();
                scan.nextLine();

                double bmi = weight / (height * height);

                if (bmi <= 15.5) {
                    System.out.println("\nUnderweight, BMI: " + bmi);
                } else if (bmi <= 24.9) {
                    System.out.println("\nIdeal weight, BMI: " + bmi);
                } else if (bmi <= 29.9) {
                    System.out.println("\nSlightly overweight, BMI: " + bmi);
                } else if (bmi <= 34.9) {
                    System.out.println("\nGrade 1 obesity, BMI: " + bmi);
                } else if (bmi <= 39.9) {
                    System.out.println("\nGrade 2 obesity (Severe), BMI: " + bmi);
                } else {
                    System.out.println("\nGrade 3 obesity (Morbid), BMI: " + bmi);
                }
                break;

            } catch (InputMismatchException exception) {
                scan.next();
                System.out.println("\nUse a comma, for example: 0,00\n");
                continue;
            }
        }
    }
}
