package com.tugas;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Calculator {
    private ArrayList <Integer> number = new ArrayList <Integer>();

    // Setter untuk menampung nilai data Array
    public void setData(int listNumber ) {
        this.number.add(listNumber);
    }

    // Getter untuk membaca nilai data Array
    public ArrayList<Integer> getData() {
        return number;
    }
}

class BasicCalculator extends Calculator {
    // Method untuk memasukan nilai ke dalam Array List
    public void BasicCollecting() {
        Scanner UserInput = new Scanner(System.in);
        int inputNumber;

        while (true) {
            System.out.print("Masukan angka (ketik 00 jika sudah selesai) : ");
            inputNumber = UserInput.nextInt();

            if (inputNumber == 00) {
                break;
            } else {
                setData(inputNumber);
            }
        }
    }

    // Method untuk operasi pertambahan
    public int Add() {
        int total = 0;
        for (int i = 0 ; i < getData().size() ; i++ ) {
            total = total + getData().get(i);
        }
        return total;
    }

    // Method untuk operasi pengurangan
    public int Substract() {
        int total = (getData().get(0)) * 2;
        for (int i = 0 ; i < getData().size() ; i++ ) {
            total = total - getData().get(i);
        }
        return total;
    }

    // Method untuk operasi perkalian
    public int Multiply() {
        int total = 1;
        for (int i = 0 ; i < getData().size() ; i++ ) {
            total = total * getData().get(i);
        }
        return total;
    }

    // Method untuk operasi pembagian
    public int Divide() {
        int total = getData().get(0) * getData().get(0);
        for (int i = 0 ; i < getData().size() ; i++ ) {
            total = total / getData().get(i);
        }
        return total;
    }
}

class ScientificCalculator extends Calculator {
    public double SquareRoot2() {
        Scanner UserInput = new Scanner(System.in);
        int inputNumber;
        double hasil;

        System.out.print("Masukan angka : ");
        inputNumber = UserInput.nextInt();
        setData(inputNumber);

        hasil = Math.sqrt(getData().get(0));
        return hasil;
    }

    public double SquareRoot3() {
        Scanner UserInput = new Scanner(System.in);
        int inputNumber;
        double hasil;

        System.out.print("Masukan angka : ");
        inputNumber = UserInput.nextInt();
        setData(inputNumber);

        hasil = Math.cbrt(getData().get(0));
        return hasil;
    }

    public int Exponentiation() {
        Scanner UserInput = new Scanner(System.in);
        int inputNumber1, inputNumber2;
        int total = 1;

        System.out.print("Masukan angka : ");
        inputNumber1 = UserInput.nextInt();
        setData(inputNumber1);
        System.out.print("Masukan pangkat : ");
        inputNumber2 = UserInput.nextInt();
        setData(inputNumber2);

        for (int i = 0 ; i < getData().get(1) ; i++) {
            total = total * getData().get(0);
        }
        return total;
    }

    public int Factorial() {
        Scanner UserInput = new Scanner(System.in);
        int inputNumber, hasil;

        System.out.print("Masukan angka : ");
        inputNumber = UserInput.nextInt();
        setData(inputNumber);

        hasil = Recursive(getData().get(0));
        return hasil;
    }

    public int Recursive(int inputNumber) {
        if (inputNumber == 1) {
            return 1;
        } else {
            inputNumber = inputNumber * Recursive(inputNumber - 1);
            return inputNumber;
        }
    }
}
