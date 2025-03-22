package ru.otus.homeworktwelve;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        };
        String rootFolder = System.getProperty("user.dir");
        File fileList = new File(rootFolder);
        if (fileList.listFiles(filter).length == 0) {
            System.out.println("Каталог " + rootFolder + " пуст.");
            return;
        }
        System.out.println("Папка " + rootFolder + " содержит файлы:");
        for (File file : fileList.listFiles(filter)) {
            System.out.println(file.getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();
        File userFile = new File(rootFolder + "\\" + fileName);
        if (!userFile.exists()) {
            System.out.println("Файла " + userFile + " в корневом каталоге нет");
            return;
        }
        try {
            DataInputStream input = new DataInputStream(new FileInputStream(rootFolder + "\\" + fileName));
            int n = input.read();
            while (n != -1) {
                System.out.print((char) n);
                n = input.read();
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        System.out.println();
        System.out.println("Введите любую строку для записи в файл:");
        String stringWrite = scanner.nextLine();
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream(rootFolder + "\\" + fileName, true));
            byte[] buffer = stringWrite.getBytes(StandardCharsets.UTF_8);
            output.write(buffer);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}

