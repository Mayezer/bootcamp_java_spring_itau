package exercices.java.com.mayezer.bootcamp;

/*
* Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela:
* Fórmula: base * altura = área
*/

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Base: ");
        double base = scan.nextDouble();

        System.out.print("Height: ");
        double height = scan.nextDouble();

        double area = base * height;

        System.out.printf("\n %s x %s = %s", base, height, area);
    }
}
