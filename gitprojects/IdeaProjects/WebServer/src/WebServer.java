import org.omg.CORBA.Request;

import java.io.*;
import java.net.*;

public class WebServer {
    public static void main(String[] args){
        ServerSocket server = null;
        Socket s = null;
        try{
            server = new ServerSocket(8080, 3, InetAddress.getByName("127.0.0.1"));
        }catch (Exception e){
            e.printStackTrace();
        }
        while (true){
            try{
                s = server.accept();
                OutputStream output = s.getOutputStream();
                InputStream input = s.getInputStream();

                Request request = new Request(input);
                String filename= request.getUri();

                Response response = new Response(output, filename);
                response.response();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
