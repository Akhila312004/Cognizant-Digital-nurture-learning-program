import java.net.URI;
import java.net.http.*;

public class HttpClient {
    public static void main(String[] args) throws Exception {
        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
            .uri(URI.create("https://api.github.com"))
            .build();
        HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(res.body());
    }
}