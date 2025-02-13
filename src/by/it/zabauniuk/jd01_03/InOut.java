package by.it.zabauniuk.jd01_03;

public class InOut {

    public static double[] getArray(String line) {
        line = line.trim();
        String[] strArray = line.split(" ");
        int count = strArray.length;
        double[] res = new double[count];
        for (int i = 0; i < count; i++) {
            res[i] = Double.parseDouble(strArray[i]);
        }
        return res;
    }

    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.5f ", name, i, arr[i]);
            if ((i + 1) % columnCount == 0 || (i + 1) == arr.length)
                System.out.println();
        }
    }
}