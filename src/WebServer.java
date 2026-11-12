import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    private final int port;
    private final PageRenderer renderer;
    private final HttpResponseBuilder responseBuilder;

    public WebServer(int port, PageRenderer renderer, HttpResponseBuilder responseBuilder) {
        this.port = port;
        this.renderer = renderer;
        this.responseBuilder = responseBuilder;
    }

    public void start() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Sunucu çalışıyor: http://localhost:" + port);
            while (true) {
                Socket client = serverSocket.accept();
                pool.execute(new ClientHandler(client, renderer, responseBuilder));
            }
        }
    }
}