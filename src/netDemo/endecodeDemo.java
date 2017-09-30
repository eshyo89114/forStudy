package netDemo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class endecodeDemo {
    public static void main(String[] args){
        String keyword;
        try{
            keyword = URLDecoder.decode("%E3%81%82%E3%81%84%E3%81%86%E3%81%88%E3%81%8A","UTF-8");
            System.out.println("decode:"+keyword);
            keyword = URLEncoder.encode("あいうえお","UTF-8");
            System.out.println("encode:"+keyword);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}
