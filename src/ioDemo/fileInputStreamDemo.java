package ioDemo;

import java.io.FileInputStream;

public class fileInputStreamDemo {
    public static void read(){
        try{
            FileInputStream fi = new FileInputStream("a.txt");
            byte[] buf = new byte[1024];
            int len = 0;
            while((len = fi.read(buf))!= -1){
                System.out.println(new String(buf,0,len));
            }
            fi.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        read();
    }

}
