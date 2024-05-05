package ApiRequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import model.Filters;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiRequest {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public double Request (String originalString, String ultimateString) throws IOException, InterruptedException {


        // Store the API key securely
        String apiKey = "17db8725421a208f39ba17d0";
        String urlKey = "https://v6.exchangerate-api.com/v6/" + apiKey +"/latest/" + Filters.removeSpacesAndUppercase(originalString);

        //Creating some parameters to control the output of the JSON

        //General Structure to get the response of the side of the server
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlKey)).build();
        HttpResponse<String> response;

        //Creating the response
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        //Access of variables of conversion rates
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject conversionRatesObject  = jsonObject.getAsJsonObject("conversion_rates");

        double currencyMade;
        currencyMade = conversionRatesObject.getAsJsonPrimitive(Filters.removeSpacesAndUppercase(ultimateString)).getAsDouble();

        return currencyMade;
    }

    public double currencyMade (String originalString, String ultimateString, double value) throws IOException, InterruptedException {
        //principal class to make the operations to the currencies
        return value * Request(originalString, ultimateString);
    }


}
