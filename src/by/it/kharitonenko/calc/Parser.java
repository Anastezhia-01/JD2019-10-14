package by.it.kharitonenko.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    Var evaluate(String expression) {
        String[] part = expression.split(Patterns.OPERATION, 2);
        Var left=Var.createVar(part[0]);
        Var right=Var.createVar(part[1]);
        if (left!=null && right!=null){
            Matcher matcher = Pattern
                    .compile(Patterns.OPERATION)
                    .matcher(expression);
            if (matcher.find()){
                String operation = matcher.group();
                switch (operation){
                    case "+": return left.add(right);
                    case "-": return left.sub(right);
                    case "*": return left.mul(right);
                    case "/": return left.div(right);
                }
            }
        }
        return null;
    }
}
