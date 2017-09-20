package ioDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("a.txt");
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            char[] buf = new char[32];
            int len = 0;
            while((len = isr.read(buf)) != -1){
                System.out.println(
                        new String(buf,0,len)
                );
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
