package ioDemo;

import java.io.*;

public class BufferedReaderWriterDemo {
    public static void main(String[] args){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("fw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String input = null;
            while(!(input = br.readLine()).equals("exit")){
                bw.write(input);
                bw.newLine();
            }
            bw.close();
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
