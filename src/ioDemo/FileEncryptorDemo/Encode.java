package ioDemo.FileEncryptorDemo;

import java.io.*;

public class Encode {
    File file;
    int key;
    boolean reWrite;
    public Encode (File file,int key,boolean reWrite){
        this.file = file;
        this.key = key;
        this.reWrite = reWrite;
    }

    private void encode(){
        if(file != null){
            if(reWrite){
             RandomAccessFile tempFile = null;
             try{
                 tempFile = new RandomAccessFile(file,"rw");
                    int tempData;
                    while((tempData = tempFile.read())!=-1){
                    tempFile.seek(tempFile.getFilePointer()-1);
                    tempFile.write(tempData^key);
                 }
             } catch (IOException e){
                 e.printStackTrace();
             }finally {
                 if(tempFile != null){
                       try {
                        tempFile.close();
                        }catch (IOException e){
                           e.printStackTrace();
                       }
                 }
             }
            }else{
                      FileInputStream fis = null;
                      FileOutputStream fos = null;
                 try{
                    fis = new FileInputStream(file);
                    fos = new FileOutputStream("encoded"+file.getName());

                        while (fis.available() > 0){
                       fos.write(fis.read()^key);
                     }
                 fos.flush();
                     }catch (IOException e){
                     e.printStackTrace();
                     }finally {
                          if(fis != null){
                            try{
                              fis.close();
                            }catch (IOException e){
                                e.printStackTrace();
                          }
                        }

                          if(fos != null){
                             try{
                                  fos.close();
                              }catch (IOException e){
                                    e.printStackTrace();
                              }
                          }
                     }
                }
        }
    }


    public void start(){
        encode();
    }
}
