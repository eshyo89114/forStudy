package ioDemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args){
        FileInputStream fis;
        try{
            fis = new FileInputStream("a.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            int i = 1;
            while((line=br.readLine())!=null){
                System.out.println(i+": " +line);
                i++;
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
