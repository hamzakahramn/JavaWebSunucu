import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private final Socket socket;
    private final PageRenderer renderer;
    private final HttpResponseBuilder responseBuilder;

    public ClientHandler(Socket socket, PageRenderer renderer, HttpResponseBuilder responseBuilder) {
        this.socket = socket;
        this.renderer = renderer;
        this.responseBuilder = responseBuilder;
    }

    @Override
    public void run() {
        try (Socket s = socket;
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
             OutputStream out = s.getOutputStream()) {

            // İstek satırlarını boş satıra kadar oku
            String line;
            while ((line = in.readLine()) != null && !line.isEmpty()) {
                // Sadece okuyoruz; her istekte aynı sayfa dönecek
            }

            out.write(responseBuilder.build(renderer.render()));
            out.flush();
        } catch (Exception e) {
            System.err.println("İstemci hatası: " + e.getMessage());
        }
    }
}