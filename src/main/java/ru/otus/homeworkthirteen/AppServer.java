package ru.otus.homeworkthirteen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);

        while (true) {
            Socket client = server.accept();
            DataInputStream input = new DataInputStream(client.getInputStream());
            DataOutputStream output = new DataOutputStream(client.getOutputStream());

            output.writeUTF("Список доступных операций: +, -, *, /");
            String clientInput = input.readUTF();
            if (clientInput.equalsIgnoreCase("exit")) {
                client.close();
                System.out.println("Клиент отключился");
                continue;
            }
            String result = calculate(clientInput.toString());
            output.writeUTF(result);
            output.flush();
        }
    }

    public static String calculate(String str) {
        String operand1 = "";
        String operand2 = "";
        float result;
        char[] array = str.toCharArray();
        int i = 0;

        while (((int) array[i]) >= 48 && ((int) array[i]) <= 57) {
            operand1 = operand1 + array[i];
            i++;
            if (i == array.length) {
                break;
            }
        }
        if (operand1.length() == array.length) {
            return "Отсутствует операция и второй операнд";
        }
        char operation = array[i];
        if (operand1.isEmpty()) {
            return "Первый операнд должен быть числом";
        }
        if (((int) operation) != 42 && ((int) operation) != 43 && ((int) operation) != 45 && ((int) operation) != 47) {
            return "Операция некорректна";
        }
        i++;
        while (i < array.length) {
            if (((int) array[i]) < 48 || ((int) array[i]) > 57) {
                return "Второй операнд должен быть числом";
            }
            operand2 += array[i];
            i++;
        }

        if (i != array.length) {
            return "Второй операнд должен быть числом";
        }
        float oper1 = Float.parseFloat(operand1);
        float oper2 = Float.parseFloat(operand2);

        if (operation == '+') {
            result = oper1 + oper2;
        } else if (operation == '-') {
            result = oper1 - oper2;
        } else if (operation == '*') {
            result = oper1 * oper2;
        } else {
            result = oper1 / oper2;
        }

        return String.valueOf(result);
    }
}
