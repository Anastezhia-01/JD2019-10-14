package by.it.kazak.calc;

interface Patterns {
    String SCALAR="-?[0-9]+(\\.[0-9]+)?";
    String VECTOR="\\{"+SCALAR+"(, *"+SCALAR+")*}";
    String MATRIX="\\{"+VECTOR+"(, *"+VECTOR+")*}";
    String OPERATION="(?<=[^-+*/={,])[-+*/=]";
    String BRAKETS = "[(]([A-Za-z]|(-?\\d+(\\.\\d+)?))([-+*/=])([A-Za-z]|(-?\\d+(\\.\\d+)?))?[)]";
}
