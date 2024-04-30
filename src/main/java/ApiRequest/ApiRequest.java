package ApiRequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import model.ExchangeOmdb;
import model.Filters;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


public class ApiRequest {
    Filters filters = new Filters();
    List<Double> rates = new ArrayList<>();
    String urlKey = "https://v6.exchangerate-api.com/v6/17db8725421a208f39ba17d0/latest/" + filters.RemoveSpaces();

    public void Request () throws IOException, InterruptedException {


        //Creating some parameters to control the output of the JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //General Structure to get the response of the side of the server
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlKey)).build();
        HttpResponse<String> response;

        //Creating the response to sout in the console
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        ExchangeOmdb exchangeOmdb = gson.fromJson(json, ExchangeOmdb.class);
        System.out.println(exchangeOmdb);

        //Access of variables of conversion rates

        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject conversionRatesObject  = jsonObject.getAsJsonObject("conversion_rates");

        rates.add(conversionRatesObject.getAsJsonPrimitive("USD").getAsDouble());
        rates.add(conversionRatesObject.getAsJsonPrimitive("COP").getAsDouble());
        rates.add(conversionRatesObject.getAsJsonPrimitive("ARS").getAsDouble());
        rates.add(conversionRatesObject.getAsJsonPrimitive("BOB").getAsDouble());
        rates.add(conversionRatesObject.getAsJsonPrimitive("BRL").getAsDouble());
    }

    public double currencyMade (int value){
        int idk = 0;
        return value * rates.get(idk);
    }


}
