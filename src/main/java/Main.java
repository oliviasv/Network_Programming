import org.apache.log4j.Logger;

public class Main {
    static Logger logger = Logger.getLogger (Main.class.getName());

    public static void main(String[] args)  {
        logger.info("Start");
        DataProcessing dataManager = new DataProcessing();
        int SERVER_PORT = Integer.parseInt(dataManager.getProperty("tcp.server.port"));
        if (new Request().initiate()) {
            logger.info("Finish");
        }
        TcpServer tcpMultiServer = new TcpServer();
        tcpMultiServer.start (SERVER_PORT);
    }
}
