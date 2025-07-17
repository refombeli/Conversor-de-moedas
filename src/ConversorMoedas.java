import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoedas {
    public ValorMoedas converter(String moedaBase, String moedaDestino, double valor) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        String chaveAPI = "e4e69180a712f1bb749f1366";
        URI conversor = URI.create("https://v6.exchangerate-api.com/v6/" + chaveAPI + "/latest/" + moedaBase);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(conversor)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);
            JsonObject taxas = json.getAsJsonObject("conversion_rates");
            double cotacao = taxas.get(moedaDestino).getAsDouble();
            double valorConvertido = valor * cotacao;
            return new ValorMoedas(moedaBase, moedaDestino, valorConvertido);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível converter esse valor!");
        }
    }

}