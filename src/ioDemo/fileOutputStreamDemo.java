package ioDemo;

import java.io.FileOutputStream;

public class fileOutputStreamDemo {
    public static void write(){
        try{
            FileOutputStream fo = new FileOutputStream("fileOutputtext.txt");
            String s  = " this is a test for \nfileoutputstream";
            fo.write(s.getBytes());
            System.out.println("write success!");

            fo.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        write();
    }

}
