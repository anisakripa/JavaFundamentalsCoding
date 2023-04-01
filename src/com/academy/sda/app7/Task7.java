package com.academy.sda.app7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje numer te plote pozitiv: ");
        int nrPerdoruesi = scanner.nextInt();
        while(nrPerdoruesi <= 0){
            System.out.println("Numri i vendosur nuk eshte i sakte! Vendosni nje numer te plote pozitiv te sakte: ");
            nrPerdoruesi = scanner.nextInt();
        }
        int nrParaardhes = 0;
        int nrAktual = 1;
        int nrFibonaci;
        System.out.print(nrPerdoruesi + " elementet e pare te vargut te fibonacit jane: " + nrAktual);
        for(int i = 1; i < nrPerdoruesi; i++){
            nrFibonaci = nrParaardhes + nrAktual;
            System.out.print(", " + nrFibonaci);
            nrParaardhes = nrAktual;
            nrAktual = nrFibonaci;
        }

    }
}
