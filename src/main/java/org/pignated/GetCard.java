
package org.pignated;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Class used to acquire Magic the Gathering Card from API.
 */
public class GetCard {
    /**
     * Method to get a random card from the Scryfall API.
     * @return Card object representing the card.
     */
    public static Card randomCard() {
        URL url;
        HttpURLConnection conn = null;
        try {
            url = new URI("https://api.scryfall.com/cards/random").toURL();
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL!!");
        } catch (ProtocolException e) {
            System.out.println("Protocol Exception!!");
        } catch (IOException e) {
            System.out.println("IOException!!");
        } catch (URISyntaxException e) {
            System.out.println("URI Syntax Exception!!");
        }
        Card card = new Card();
        try {
            assert conn != null;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
                for(String line; (line = reader.readLine()) != null; ) {
                    Gson gson = new Gson();
                    card = gson.fromJson(line, Card.class);
                }
            }
        } catch (IOException e) {
            System.out.println("IOException!!");
        }
        return card;
    }
    public static Card randomCard(String set){
        URL url;
        HttpURLConnection conn = null;
        set = set.replace(" ", "");
        try {
            url = new URI("https://api.scryfall.com/cards/random?q=set%3A"+set).toURL();
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL!!");
        } catch (ProtocolException e) {
            System.out.println("Protocol Exception!!");
        } catch (IOException e) {
            System.out.println("IOException!!");
        } catch (URISyntaxException e) {
            System.out.println("URI Syntax Exception!!");
        }
        Card card = new Card();
        try {
            assert conn != null;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
                for(String line; (line = reader.readLine()) != null; ) {
                    Gson gson = new Gson();
                    card = gson.fromJson(line, Card.class);
                }
            }
        } catch (IOException e) {
            System.out.println("IOException!!");
        }
        return card;
    }
}
