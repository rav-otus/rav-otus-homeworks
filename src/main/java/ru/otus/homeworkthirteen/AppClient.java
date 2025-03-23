package ru.otus.homeworkthirteen;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class AppClient {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try (Socket socket = new Socket("localhost", 8080);) {
                Client client = new Client(socket.getInputStream(), socket.getOutputStream());
                String fromServer = client.getInput().readUTF();
                System.out.println(fromServer);
                System.out.println("Введите два числа и операцию");
                String operationString = scanner.nextLine();
                client.send(operationString);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
