package com.tugas;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int choice1;
        int choice2;
        int choice3;
        int hasil;

        while (true) {
            System.out.println("\nProgram Kalkulator");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.println("0. Keluar Program");
            System.out.print("Masukan pilihan anda : ");
            choice1 = UserInput.nextInt();

            if (choice1 == 1) {
                System.out.println("\nBasic Calculator");
                System.out.println("1. Add (Penjumlahan)");
                System.out.println("2. Substract (Pengurangan)");
                System.out.println("3. Multiply (Perkalian)");
                System.out.println("4. Divide (Pembagian)");
                System.out.println("0. Kembali");
                System.out.print("Masukan pilihan anda : ");
                choice2 = UserInput.nextInt();

                if (choice2 == 1) {
                    BasicCalculator addMethod = new BasicCalculator();
                    addMethod.BasicCollecting();
                    hasil = addMethod.Add();
                    System.out.printf("Hasil perhitungan = %d\n\n", hasil);

                } else if (choice2 == 2) {
                    BasicCalculator substractMethod = new BasicCalculator();
                    substractMethod.BasicCollecting();
                    hasil = substractMethod.Substract();
                    System.out.printf("Hasil perhitungan = %d\n\n", hasil);

                } else if (choice2 == 3) {
                    BasicCalculator multiplyMethod = new BasicCalculator();
                    multiplyMethod.BasicCollecting();
                    hasil = multiplyMethod.Multiply();
                    System.out.printf("Hasil perhitungan = %d\n\n", hasil);

                } else if (choice2 == 4) {
                    BasicCalculator divideMethod = new BasicCalculator();
                    divideMethod.BasicCollecting();
                    hasil = divideMethod.Divide();
                    System.out.printf("Hasil perhitungan = %d\n\n", hasil);

                } else {
                    continue;
                }

            } else if (choice1 == 2) {
                System.out.println("\nScientific Calculator");
                System.out.println("1. SquareRoot (Nilai Akar)");
                System.out.println("2. Exponentiation (Nilai Pangkat)");
                System.out.println("3. Factorial (Nilai Factorial)");
                System.out.println("0. Kembali");
                System.out.print("Masukan pilihan anda : ");
                choice2 = UserInput.nextInt();

                if (choice2 == 1) {
                    ScientificCalculator rootMethod = new ScientificCalculator();

                    System.out.println("\nSquareRoot (Nilai Akar)");
                    System.out.println("1. Akar kuadrat");
                    System.out.println("2. Akar kubik");
                    System.out.println("0. Kembali");
                    System.out.print("Masukan pilihan anda : ");
                    choice3 = UserInput.nextInt();

                    if (choice3 == 1) {
                        double hasilAkar = rootMethod.SquareRoot2();
                        System.out.printf("Hasil perhitungan = %f\n\n", hasilAkar);

                    } else if (choice3 == 2) {
                        double hasilAkar = rootMethod.SquareRoot3();
                        System.out.printf("Hasil perhitungan = %f\n\n", hasilAkar);

                    } else {
                        continue;
                    }

                } else if (choice2 == 2) {
                    ScientificCalculator exponentialMethod = new ScientificCalculator();
                    hasil = exponentialMethod.Exponentiation();
                    System.out.printf("Hasil perhitungan = %d\n\n", hasil);

                } else if (choice2 == 3) {
                    ScientificCalculator factorialMethod = new ScientificCalculator();
                    hasil = factorialMethod.Factorial();
                    System.out.printf("Hasil perhitungan = %d\n\n", hasil);

                } else {
                    continue;
                }

            } else {
                return;
            }
        }

    }
}
