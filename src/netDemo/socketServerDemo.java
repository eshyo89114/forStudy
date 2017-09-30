package netDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class socketServerDemo {
    public static void main(String[] args){
        ServerSocket ss;
        try{
            ss = new ServerSocket(8338);
            System.out.println("server start....");

            Socket socket = ss.accept();
            BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            String line;
            while((line = br.readLine())!= null){
                pw.println(line);

                pw.flush();
                System.out.println(line);
            }
            ss.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
