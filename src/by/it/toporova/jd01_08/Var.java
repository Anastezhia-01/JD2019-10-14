package by.it.toporova.jd01_08;

abstract class Var implements Operation { //все потомки var будут реализовывать интерфейс operation


    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция вычитания " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция деления " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public String toString() { //наследуется от object
        return "Это класс Var";
    }
}
