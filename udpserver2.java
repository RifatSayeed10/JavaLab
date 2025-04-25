import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpserver2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);
        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        System.out.println("UDP Server is running... Waiting for messages...");

        socket.receive(packet);
        String receivedMessage = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received: " + receivedMessage);

        socket.close();
    }
}
