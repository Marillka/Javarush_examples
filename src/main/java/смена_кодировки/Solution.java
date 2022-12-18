package смена_кодировки;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Solution {
    public static void main(String[] args) throws IOException {
        String firstFilename = args[0];
        String secondFilename = args[1];

        Charset windows1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");

        FileInputStream fileInputStream = new FileInputStream(firstFilename);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFilename);
        byte[] buffer = new byte[1000];
        fileInputStream.read(buffer);
        String s = new String(buffer, windows1251);
        buffer = s.getBytes(utf8);
        fileOutputStream.write(buffer);
    }
}
