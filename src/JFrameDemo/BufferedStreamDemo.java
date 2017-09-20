package JFrameDemo;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args){

        try {
            FileInputStream fis = new FileInputStream("BOSdemo.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("fosdDemo.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int d = -1;
            while ((d = bis.read()) != -1) {
                bos.write(d);
            }

            bos.close();
            fos.close();
            bis.close();
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
