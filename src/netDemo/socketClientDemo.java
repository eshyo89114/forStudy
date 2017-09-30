package netDemo;

import java.io.*;
import java.net.Socket;

public class socketClientDemo {
    public static void main(String[] args){
        Socket ss;
        try{
            ss = new Socket("localhost",8338);
            BufferedReader br = new BufferedReader(new InputStreamReader( ss.getInputStream()));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(ss.getOutputStream())));
            pw.println("hello java in net1!!");
            pw.flush();
            System.out.println(br.readLine());
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
