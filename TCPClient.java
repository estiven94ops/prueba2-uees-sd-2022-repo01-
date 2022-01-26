import java.io.OutputStream; import java.net.InetAddress; import java.net.Socket; import java.util.Scanner; import java.io.DataOutputStream;

public class TCPClient {

    public static final void main(final String[] args){
        Socket client;
        OutputStream os;
        InetAddress connection; //La clase InetAddress se usa para encapsular tanto la dirección IP numérica como el nombre de dominio para esa dirección.
        
        
        int numero = (int)(Math.random()*10+1);

        try{
        connection = InetAddress.getByName("10.10.10.1");
        client = new Socket(connection, 9999);

        os = client.getOutputStream();
       
        os.write(numero);

        client.close();

        } catch (Throwable t){
        t.printStackTrace();
        }
    }
}
