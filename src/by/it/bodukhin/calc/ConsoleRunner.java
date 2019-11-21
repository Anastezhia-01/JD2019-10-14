package by.it.bodukhin.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Printer printer = new Printer();
        Parser parser = new Parser();
        for(;;) {
            String expression = scanner.nextLine();
            if(expression.equals("end"))
                break;
            if(expression.equals("printvar")) {
                Var.printMap();
            }
            Var result=parser.evaluate(expression);
            printer.print(result);
        }
    }
}