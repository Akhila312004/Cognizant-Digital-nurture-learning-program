import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Server starting...");
        try (ServerSocket ss = new ServerSocket(5000)) {
            System.out.println("Waiting for client connection...");
            
            try (Socket s = ss.accept();
                 BufferedReader br = new BufferedReader(
                     new InputStreamReader(s.getInputStream()))) {
                
                System.out.println("Client connected!");
                String str = br.readLine();
                System.out.println("Client says: " + str);
                
                // Send response back to client
                PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                pw.println("Message received by server");
            }
        }
    }
}