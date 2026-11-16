package exercices.java.com.mayezer.bootcamp;

/*
* Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela:
* Fórmula: lado * lado = área
*/


import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Side one: ");
        double sideOne = scan.nextDouble();

        System.out.print("Side two: ");
        double sideTwo = scan.nextDouble();

        double area = sideOne * sideTwo;

        System.out.printf("\n %s x %s = %s", sideOne, sideTwo, area);
    }
}
