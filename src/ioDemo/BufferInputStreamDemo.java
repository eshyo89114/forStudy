package ioDemo;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferInputStreamDemo {
    public static void main(String[] args){

        try {
            FileInputStream FIS = new FileInputStream("a.txt");
            BufferedInputStream BIS = new BufferedInputStream(FIS);

            int flag = -1;
            byte[] buf = new byte[256];

            while ((flag = BIS.read()) != -1) {
                //System.out.println(flag + " ");
                String str = new String(buf,0,flag);
                System.out.println(str);
            }

            BIS.close();
            FIS.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
