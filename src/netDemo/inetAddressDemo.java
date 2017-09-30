package netDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddressDemo {
    public static void main(String[] args){
        InetAddress address;
        try{
            address = InetAddress.getByName("www.baidu.com");
            System.out.println(address);
            InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
            for(InetAddress addr:addresses){
                System.out.println(addr);
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
