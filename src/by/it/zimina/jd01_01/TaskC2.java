package by.it.zimina.jd01_01;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println("DEC:"+a+"+"+b+"="+sum);

        String bin_a = Integer.toBinaryString(a);
        String bin_b = Integer.toBinaryString(b);
        String bin_sum = Integer.toBinaryString(sum);
        System.out.println("BIN:"+bin_a+"+"+bin_b+"="+bin_sum);

        String hex_a = Integer.toHexString(a);
        String hex_b = Integer.toHexString(b);
        String hex_sum = Integer.toHexString(sum);
        System.out.println("HEX:"+hex_a+"+"+hex_b+"="+hex_sum);

        String oct_a = Integer.toOctalString(a);
        String oct_b = Integer.toOctalString(b);
        String oct_sum = Integer.toOctalString(sum);
        System.out.println("OCT:"+oct_a+"+"+oct_b+"="+oct_sum);

    }


}
