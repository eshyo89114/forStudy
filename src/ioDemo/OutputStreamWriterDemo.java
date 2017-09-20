package ioDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("osw.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            osw.write("hello");
            osw.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
