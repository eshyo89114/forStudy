package ioDemo;

import java.io.RandomAccessFile;
import java.util.Arrays;

public class randomAccessDemo {

    public static void main(String[] args){
        try{
            RandomAccessFile rf = new RandomAccessFile("a.txt","rw");
            System.out.println(rf.getFilePointer());
            rf.write('A');

            System.out.println(rf.getFilePointer());
            rf.write('B');

            String s = "string";
            byte[] gbk = s.getBytes("gbk");
            rf.write(gbk);

            System.out.println(rf.getFilePointer());
            rf.seek(0);

            byte[] buf = new byte[(int)rf.length()];
            rf.read(buf);
            System.out.println(Arrays.toString(buf));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
