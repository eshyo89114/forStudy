package netDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class connectionDemo {
    private static String imgUrl = "https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike116%2C5%2C5%2C116%2C38/sign=69bac18c9b8fa0ec6bca6c5f47fe328b/6a600c338744ebf811266780d3f9d72a6059a73d.jpg";
    public static void main(String[] args){
        URL url;
        try{
            url = new URL(imgUrl);

            URLConnection uc = url.openConnection();

            if(uc!=null){
                InputStream in = uc.getInputStream();
                BufferedInputStream bin = new BufferedInputStream(in);
                FileOutputStream out = new FileOutputStream("aragaki.jpg");
                BufferedOutputStream bout = new BufferedOutputStream(out);
                int c;
                while((c = bin.read())!= -1){
                    bout.write(c);
                    bout.flush();
                }
                in.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
