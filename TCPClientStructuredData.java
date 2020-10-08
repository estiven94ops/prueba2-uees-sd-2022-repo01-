import java.io.DataInputStream;   import java.io.DataOutputStream;
import java.net.InetAddress;      import java.net.Socket;

public class TCPClientStructuredData {

  public static final void main(final String[] args) {
    Socket            client;     InetAddress       ia;
    DataOutputStream  dos;        DataInputStream   dis;    

    try {
      ia = InetAddress.getByName("10.10.10.1");
      
      client = new Socket(ia, 9996); //(*@\clientBox{1+2)}@*)
      int numero;
      dos = new DataOutputStream(client.getOutputStream()); //marshall data
      numero = (int) (Math.random() * 10) + 1;
      dos.write(numero);
      
      client.close(); //(*@\clientBox{4)}@*)
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }
}