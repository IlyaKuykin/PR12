import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public static String sendPost(String urlString, String params) throws Exception {
    URL url = new URL(urlString);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    connection.setRequestMethod("POST");
    connection.setDoOutput(true);

    try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
        byte[] postData = params.getBytes(StandardCharsets.UTF_8);
        outputStream.write(postData);
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    StringBuilder response = new StringBuilder();
    String line;

    while ((line = reader.readLine()) != null) {
        response.append(line);
    }

    reader.close();
    connection.disconnect();

    return response.toString();
}
