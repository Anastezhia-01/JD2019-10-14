package by.it.sermyazhko.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        step1();
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        step2(month);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        step3(a, b, c);
    }

    private static void step3(double a, double b, double c) {
        double d = Math.pow(b,2) - 4*a*c;
        if (d < 0){
            System.out.println("корней нет");
        }
        else if (d==0){
            double x = -b/(2*a);
            System.out.println(x);
        }
        else {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }

    }

    private static void step2(int month) {
        switch (month){
            case 1: {
                System.out.println("январь");
                break;
            }case 2: {
                System.out.println("февраль");
                break;
            }case 3: {
                System.out.println("март");
                break;
            }case 4: {
                System.out.println("апрель");
                break;
            }case 5: {
                System.out.println("май");
                break;
            }case 6: {
                System.out.println("июнь");
                break;
            }case 7: {
                System.out.println("июль");
                break;
            }case 8: {
                System.out.println("август");
                break;
            }case 9: {
                System.out.println("сентябрь");
                break;
            }case 10: {
                System.out.println("октябрь");
                break;
            }case 11: {
                System.out.println("ноябрь");
                break;
            }case 12: {
                System.out.println("декабрь");
                break;
            }
            default:{
                System.out.println("нет такого месяца");
            }

        }

    }

    private static void step1() {
        byte n = 5;
        byte  min = 1;
        byte  max = 25;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(min + " ");
                min+=1;
            }
            System.out.println("\n");
            if (min == max){
                break;
            }
        }
    }
}
