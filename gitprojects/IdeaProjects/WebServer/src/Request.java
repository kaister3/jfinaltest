import com.sun.corba.se.spi.activation.Server;

import java.io.*;

public class Request {
    public static void main(String[] args){
        ;
    }
    InputStream input;
    public Request(InputStream input){
        this.input = input;
    }
    public String getUri() throws IOException{
        String content = null, str = null;
        StringBuffer request = new StringBuffer();
        byte[] buffer = new byte[2048];
        int i = 0;

        try{
            i = input.read(buffer);
        }catch (IOException e){
            e.printStackTrace();
        }
        content = request.toString();
        if (content != null) return getFilename(content);
        else return null;
    }

    public String getFilename(String content){
        int a, b;
        a = content.indexOf(' ');
        if (a != -1){
            b = content.indexOf('?', a + 1);
            if (b == -1) b = content.indexOf(' ', a + 1);
            return content.substring(a + 2, b);
        }
        return null;
    }
}
