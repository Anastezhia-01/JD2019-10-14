package by.it.bodukhin.jd01_15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TaskC {
    
    private static StringBuilder defaultDir = new StringBuilder(getPath(TaskC.class));
    private static File defDir = new File(defaultDir.toString());
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputPath;
        while (!(inputPath=sc.nextLine()).equalsIgnoreCase("end")){
            StringBuilder cmd = new StringBuilder(inputPath);
            changeDirectory(cmd);
        }
        
    }

    private static void changeDirectory(StringBuilder input) {
        if (!input.toString().contains(" ")) input.append(" ");
        String[] commands = input.toString().split(" ", 2);
        if (commands[0].equals("cd") && commands[1].equals("..")) {
            String parentDir = defDir.getParent();
            defDir = new File(parentDir);
            System.out.println(defDir.getAbsolutePath());
        } else {
            String newPath = defDir.getAbsolutePath() + File.separator + commands[1];
            File tFile = new File(newPath);
            if (tFile.exists()) {
                defDir = new File(newPath);
                System.out.println(defDir.getAbsolutePath());
            } else System.out.println("Incorrect path: " + newPath);
        }
        if (commands[0].equals("dir") && (commands[1].isEmpty() | commands[1].equals(""))) {
            File[] files = defDir.listFiles();
            if (files != null) {
                for (File element : files) {
                    SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    if (element.isFile()) {
                        long totalSpace = element.getTotalSpace();
                        System.out.printf("%-20s\t%-10d\t%-20s", data.format(element.lastModified()), totalSpace, element.getName());
                        System.out.println();
                    } else {
                        System.out.printf("%-20s\t%-10s\t\t%-20s", data.format(element.lastModified()), "<DIR>", element.getName());
                        System.out.println();
                    }
                }
            }
        }
    }

    private static String getPath(Class<?> nameClass) {
        return System.getProperty("user.dir")
                + File.separator + "src" + File.separator +
                nameClass
                        .getName()
                        .replace(nameClass.getSimpleName(), "")
                        .replace(".", File.separator);
    }
}
