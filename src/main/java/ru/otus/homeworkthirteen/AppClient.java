package ru.otus.homeworkthirteen;

import java.io.IOException;
import java.net.Socket;

public class AppClient {
    public static void main(String[] args){

        while(true) {
            try (Socket socket = new Socket("localhost", 9090);) {
                Client client = new Client(socket.getInputStream(), socket.getOutputStream());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
