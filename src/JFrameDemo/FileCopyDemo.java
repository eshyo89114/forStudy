package JFrameDemo;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args){
        try{
            FileInputStream in = new FileInputStream("A.txt");
            FileOutputStream ou =new FileOutputStream("Copy.txt");

            byte[] buf = new byte[256];
            int len = 0;
            while((len = in.read(buf)) != -1){
                ou.write(buf,0,len);
                System.out.println(new String(buf,0,len));
            }

            in.close();
            ou.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
