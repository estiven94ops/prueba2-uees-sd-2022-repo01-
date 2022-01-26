import java.io.InputStream; import java.net.ServerSocket; import java.net.Socket; import java.io.DataInputStream;

public class TCPServer {
    public static final void main(final String[] args) {
    ServerSocket server;
    Socket client;
    //InputStream is;
    InputStream is;
    int n;

    try {
        server = new ServerSocket(5000);
        System.out.println("servidor iniciado");

        for (int j = 5; (--j) >= 0;){
            client = server.accept();

            is = client.getInputStream();
            n = is.read();

            for(int i = 0; i < n; i++){
                System.out.print("X");
            }
            System.out.print('\n');

            client.close();
            }
        server.close();

        } catch (Throwable t){
            t.printStackTrace();
        }

    }


}
