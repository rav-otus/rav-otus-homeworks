package ru.otus.homeworkthirteen;

import java.io.*;

public class Client implements AutoCloseable {
    private final DataInputStream input;
    private final DataOutputStream output;

    public Client(InputStream input, OutputStream output){
        this.input = new DataInputStream(input);
        this.output = new DataOutputStream(output);
    }

    public void send(String message) throws IOException {
        output.writeUTF(message);
        output.flush();
        try{
            String result = input.readUTF();
            System.out.println("Результат: "+result);
        } catch(EOFException){
            System.out.println("Сервер закрыл соединение");
        }
    }
    @Override
    public void close() throws Exception {
        input.close();
        output.close();
    }
}
