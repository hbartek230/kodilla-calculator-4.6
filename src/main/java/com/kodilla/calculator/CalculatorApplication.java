package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    static double suma, roznica;

    public static void dodaj(double a, double b){
        suma = a + b;
    }

    public static void odejmij(double a, double b){
        roznica = a-b;
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wartość a: ");
        double a = Double.parseDouble(scan.nextLine());
        System.out.print("\nPodaj wartość b: ");
        double b = Double.parseDouble(scan.nextLine());

        dodaj(a, b);
        System.out.println("Suma wynosi: " + suma);
        odejmij(a, b);
        System.out.println("Różnica wynosi:  " + roznica);
    }

}
