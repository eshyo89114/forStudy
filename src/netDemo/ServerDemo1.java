package netDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public ServerDemo1() {
        ServerSocket ss;
        try{
            ss = new ServerSocket(8338);
            System.out.println("Server starting....");
            while (true) {
                Socket socket = ss.accept();
                new MyThread(socket).start();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    class MyThread extends Thread{
        Socket socket;

        public MyThread(Socket socket){
            this.socket = socket;
        }

        public void run(){
            BufferedReader br;
            try{
                br =new BufferedReader(new InputStreamReader( socket.getInputStream()));
                PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                    pw.println(line);
                    pw.flush();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static  void main(String[] args){
        ServerDemo1 netDemo = new ServerDemo1();
    }
}
