package by.it.akhmelev.jd01_09;

abstract class Var implements Operation {

    @Override
    public Var add(Var other) {
        System.out.printf("Сложение %s + %s невозможно\n", this, other);
        //TODO add exception
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Вычитание %s - %s невозможно\n", this, other);
        //TODO add exception
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Умножение %s * %s невозможно\n", this, other);
        //TODO add exception
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Деление %s / %s невозможно\n", this, other);
        //TODO add exception
        return null;
    }

    @Override
    public String toString() {
        return "abstract Var";
    }

    public static Var createVar(String strVar) {
        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        else if (strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        else if (strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        else
            return null;
    }
}
