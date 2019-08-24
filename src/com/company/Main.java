package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scage = new Scanner(System.in);
        System.out.println("Здраствуйте, введите выше имя: ");
        String name = scage.nextLine();

        int age = generateRandomAge();

        Scanner sctemp = new Scanner(System.in);
        System.out.println("Введите температуру сейчас: ");

        int temp = sctemp.nextInt();

        if (age > 45) {
            if (temp > 30 || temp < -20) {
                System.out.println(name + " " + "не выходит гулять");
            } else {
                System.out.println(name + " " + "отправляется в гости к другу");
            }
        } else if (age > 20 && age < 45) {
            if (temp > 25 || temp < -10) {
                System.out.println(name + " " + "не выходит гулять");
            } else {
                System.out.println(name + " " + "отправляется в гости к другу");
            }
        } else if (age < 20) {
            if (temp > 28 || temp < 0) {
                System.out.println(name + " " + "не выходит гулять");
            } else {
                System.out.println(name + " " + "отправляется в гости к другу");
            }
        }
    }

    public static int generateRandomAge() {
        Random rand = new Random();
        System.out.println("Ваш возраст " + (rand.nextInt(107) + 1));
        return 0;
    }
}
