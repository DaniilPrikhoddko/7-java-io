package com.example.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream can't be null");
        }
        if (charset == null) {
            throw new IllegalArgumentException("Charset can't be null");
        }
        try (InputStreamReader isr = new InputStreamReader(inputStream, charset)) {
            BufferedReader br = new BufferedReader(isr);
            return br.readLine();
        }
    }
}
