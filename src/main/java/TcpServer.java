import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    static Logger logger = Logger.getLogger(TcpServer.class.getName());

    public void start(int port) {
        logger.info("TCP Multi-Server Started");
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                new TcpMultiServer(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class TcpMultiServer extends Thread {
        static Logger logger = Logger.getLogger(TcpServer.class.getName());

        public TcpMultiServer(Socket socket) {
            logger.info("New Client");
        }

    }
}

