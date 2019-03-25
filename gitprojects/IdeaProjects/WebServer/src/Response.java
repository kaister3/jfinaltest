import sun.plugin2.gluegen.runtime.BufferFactory;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class Response {
    public OutputStream output;
    public String Filename;
    private static final int BUFER_SIZE = 1024;
    public Response(OutputStream output, String filename){
        this.output = output;
        this.Filename = filename;
    }

    public void response() throws IOException{
        String path = System.getProperty("user.dir");
        byte[] bufer = new byte[BUFER_SIZE];
        int ch;
        FileInputStream fis = null;
        if (path != null && Filename != null){
            File file = new File(path, Filename);
            String str = "";
            if (file.exists()){
                fis = new FileInputStream(file);
                str = "HTTP/1/1 200 OK \r\n" +
                        "Content-Type: text/html\r\n" +
                        "\r\n";
                output.write(str.getBytes());
                ch = fis.read(bufer);
                while (ch != -1){
                    output.write(bufer, 0, ch);
                    ch = fis.read(bufer, 0, BUFER_SIZE);
                }
            }
            else {
                str = "HTTP/1.1 404 File Not Found \r\n" +
                        "Content-Type: text/html\r\n" +
                        "Content-Length: 100\r\n" +
                        "\r\n" +
                        "<h1>404 File Not Found!</h1>";
                output.write(str.getBytes());
            }
        }
        output.close();
    }
}
