package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static int size;

    static int[] createMass() {
        System.out.println("Введіть розмір масиву: ");
        size = scan.nextInt();
        int[] mass = new int[size];
        System.out.println("Введіть елементи масиву: ");
        for (int i = 0; i < size; i++) {
            mass[i] = scan.nextInt();
        }
        return mass;
    }

    static int[] createRandMass(int min, int max) {
        System.out.println("Введіть розмір масиву: ");
        size = scan.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            mass[i] = rand.nextInt(max - min) + min;
        }
        return mass;
    }

    static void printMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    static void findMaxPair(int[]mass){
        int max1 = mass[0], max2 = mass[1], max1I = 0, max2I = 1;
        for (int i = 0; i<size; i++){
            if (i+1!= size){
                if (max1+max2<mass[i]+mass[i+1]){
                    max1 = mass[i];
                    max1I = i;
                    max2 = mass[i+1];
                    max2I = i+1;
                }
            }
        }
        System.out.println("Максимальна сума сусідніх елементів = "+(max1+max2)+": X1 = "+max1+"(ind: "+max1I+"), X2 = "+max2+"(ind: "+max2I+");");
    }

    static void findMax(int[]mass){
        int max = Math.abs(mass[0]);
        for (int i = 0; i<size; i++){
            if (max<Math.abs(mass[i])){
                max = Math.abs(mass[i]);
            }
        }
        System.out.println("Максимальний елемент масива за модулем: "+max+";");
    }

    static int findDot(int[] mass) {
        int ind = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]>0) {
                return i;
            }
        }
        return 0;
    }

    static void plusDob(int[] mass) {
        int sum = 0;
        int i = findDot(mass) + 1;
        if (i!=0){
            for (; i < mass.length; i++) {
                sum += mass[i];
            }
            System.out.println("Сума чисел після мінімального числа: " + sum + ";");
        }else{
            System.out.println("Додатнього числа у масиві нема;");
        }
    }

    public static void main(String[] args) {
        System.out.println("Оберіть завдання, натисніть цифру: \n1 - Сума cусідніх елементів; \n2 - Номер максимального за модулем та добуток після додатнього числа;");
        int zav = scan.nextInt();
        switch (zav) {
            case 1:
                System.out.println("Який спосіб вводу оберете? \n1 - Ввід з клавіатури; \n2 - Рандомний ввід на проміжку [-100;100];");
                zav = scan.nextInt();
                switch (zav) {
                    case 1:
                        int[] mass = createMass();
                        findMaxPair(mass);
                        break;
                    case 2:
                        mass = createRandMass(-100, 100);
                        printMass(mass);
                        findMaxPair(mass);
                        break;
                    default:
                        System.out.println("Невірне число.");
                        break;
                }
                break;
            case 2:
                System.out.println("Оберіть спосіб вводу? \n1 - Ввід з клавіатури; \n2 - Рандомний ввід на проміжку [-100;100];");
                zav = scan.nextInt();
                switch (zav) {
                    case 1:
                        int[] mass = createMass();
                        findMax(mass);
                        plusDob(mass);
                        break;
                    case 2:
                        mass = createRandMass(-100, 100);
                        printMass(mass);
                        findMax(mass);
                        plusDob(mass);
                        break;
                    default:
                        System.out.println("Невірне число.");
                        break;
                }
                break;
            default:
                System.out.println("Невірне число.");
                break;
        }
    }
}
