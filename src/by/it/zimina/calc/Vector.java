package by.it.zimina.calc;

import java.util.Arrays;

class Vector extends Var {

    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double[] sub = Arrays.copyOf(value,value.length);
            for (int i = 0; i < sub.length; i++) {
                sub[i]= sub[i]+((Scalar)other).getValue();
            }
            return new Vector(sub);
        }
        else if (other instanceof Vector) {
            double[] sub = Arrays.copyOf(value,value.length);
            for (int i = 0; i < sub.length; i++) {
                sub[i]= sub[i]+((Vector)other).value[i];
            }
            return new Vector(sub);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double[] sub = Arrays.copyOf(value,value.length);
            for (int i = 0; i < sub.length; i++) {
                sub[i]= sub[i]-((Scalar)other).getValue();
            }
            return new Vector(sub);
        }
        else if (other instanceof Vector) {
            double[] sub = Arrays.copyOf(value,value.length);
            for (int i = 0; i < sub.length; i++) {
                sub[i]= sub[i]-((Vector)other).value[i];
            }
            return new Vector(sub);
        }
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            double[] sub = Arrays.copyOf(value,value.length);
            for (int i = 0; i < sub.length; i++) {
                sub[i]= sub[i]*((Scalar)other).getValue();
            }
            return new Vector(sub);
        }
        else if (other instanceof Vector) {
            double res=0;
            for (int i = 0; i < this.value.length; i++) {
                res+=this.value[i]*((Vector)other).value[i];
            }
            return new Scalar(res);
        }
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar) {
            double[] mul = Arrays.copyOf(value,value.length);
            for (int i = 0; i < mul.length; i++) {
                mul[i]= mul[i]/((Scalar)other).getValue();
            }
            return new Vector(mul);
        }
        else
            return super.div(other);
        }
    }

