package netDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class datagramClientDemo {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = null;
        ds = new DatagramSocket(8668);
        byte[] buf = "hello,datagram".getBytes();

        InetAddress destination = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(buf,buf.length,destination,8338);
        ds.send(dp);

        ds.close();
    }
}
