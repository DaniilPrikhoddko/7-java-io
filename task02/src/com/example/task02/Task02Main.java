package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        OutputStream os = System.out;
        int prev = is.read();
        int cur;
        boolean hasData = false;

         while ((cur = is.read()) != -1) {
             if (prev != 13 || cur != 10) {
                 os.write(prev);
             }
            if (cur != -1) {
                prev = cur;
                hasData = true;
            }
         }

         if (hasData) {
             os.write(prev);
         }

         os.flush();

        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
    }
}
