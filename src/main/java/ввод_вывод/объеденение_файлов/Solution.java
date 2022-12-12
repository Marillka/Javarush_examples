package ввод_вывод.объеденение_файлов;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String firstFile = scanner.nextLine();
        String secondFile = scanner.nextLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try (FileInputStream firstInput = new FileInputStream(firstFile);
             FileInputStream secondInput = new FileInputStream(secondFile);
             FileOutputStream outputStream = new FileOutputStream(firstFile)) {

            while (secondInput.available() > 0) {
                byteArrayOutputStream.write(secondInput.read());
            }

            while (firstInput.available() > 0) {
                byteArrayOutputStream.write(firstInput.read());
            }

            byteArrayOutputStream.writeTo(outputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
