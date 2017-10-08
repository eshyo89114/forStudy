package netDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class datagramServerDemo {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(8338);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,0,buf.length);

        ds.receive(dp);
        String data = new String(dp.getData(),0,dp.getLength());
        System.out.println(data);
        ds.close();
    }
}
