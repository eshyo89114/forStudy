package ioDemo;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args){
        try{
            FileOutputStream FOS = new FileOutputStream("BOSdemo.txt");
            BufferedOutputStream BOS = new BufferedOutputStream(FOS);

            BOS.write("hello world!".getBytes());
            BOS.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
