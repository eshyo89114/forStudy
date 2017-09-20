package factorStudy.Bridge.examDemo2;

import java.io.FileInputStream;
import java.io.IOException;

public class TxtDisplayImpl extends DisplayImpl {

    private FileInputStream file;
    private String filename;
    private byte[] buff = new byte[1024];
    private String str;

    public TxtDisplayImpl(String filename){
        this.filename = filename;
    }
    @Override
    public void rawOpen() {
        try {
            this.file = new FileInputStream(filename);
            int len =0;
            while((len=file.read(buff))!=-1){
                str = new String(buff,0,len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawPrint() {
        System.out.println(str);
    }

    @Override
    public void rawClose() {
        try {
            this.file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
