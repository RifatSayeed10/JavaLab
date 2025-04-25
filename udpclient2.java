import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpclient2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] buffer = "Hello".getBytes();
        InetAddress address = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 9876);
        socket.send(packet);
        System.out.println("Message sent: Hello");

        socket.close();
    }
}
