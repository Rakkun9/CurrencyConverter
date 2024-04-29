package ApiRequest;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import model.ConversionRates;
import model.Exchange;
import model.ExchangeOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class ApiRequest {
    public static void main(String[] args) throws IOException, InterruptedException{
        String urlKey = "https://v6.exchangerate-api.com/v6/17db8725421a208f39ba17d0/latest/COP";

        //Creating some parameters to control the output of the JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //General Structure to get the response of the side of the server
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlKey)).build();
        HttpResponse<String> response;

        //Creating the response to sout in the console
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        //Access of variables of conversion rates


        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject conversionRatesObject  = jsonObject.getAsJsonObject("conversion_rates");

        double usdValue = conversionRatesObject.get("USD").getAsDouble();
        double copValue = conversionRatesObject.get("COP").getAsDouble();
        double arsValue = conversionRatesObject.get("ARS").getAsDouble();
        double bobValue = conversionRatesObject.get("BOB").getAsDouble();
        double brlValue = conversionRatesObject.get("BRL").getAsDouble();

        ConversionRates conversionRates = new ConversionRates(usdValue, copValue, arsValue, bobValue, brlValue);
        System.out.println("usdValue = " + usdValue);
        System.out.println(copValue);
        System.out.println(arsValue);
        System.out.println(bobValue);
        System.out.println(brlValue);

        ExchangeOmdb exchangeOmdb = gson.fromJson(json, ExchangeOmdb.class);
        System.out.println(exchangeOmdb);

        Exchange exchange = new Exchange(exchangeOmdb);
        System.out.println(exchange);
    }

}
