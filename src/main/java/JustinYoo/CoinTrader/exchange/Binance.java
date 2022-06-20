package JustinYoo.CoinTrader.exchange;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Map;

@Component
@Getter
public class Binance extends Exchange {

    private String priceBit;
    private String priceEther;

    public Binance() throws JsonProcessingException {
        this.priceBit = getPrice("BTCUSDT");
        this.priceEther = getPrice("ETHUSDT");
    }

    @Override
    public int buy(String coinName, long price) {
        System.out.println("Binance: " + "buy " + coinName + " at " + price);
        return 0;
    }

    @Override
    public int sell(String coinName, long price) {
        System.out.println("Binance: " + "sell " + coinName + " at " + price);
        return 0;
    }
    @Override
    public String getPrice(String coinName) throws JsonProcessingException {
        WebClient webClient = WebClient.create();
        WebClient.ResponseSpec responseSpec = webClient.get()
                .uri("https://www.binance.com/api/v3/ticker/price?symbol=" + coinName)
                .retrieve();
        String responseBody = responseSpec.bodyToMono(String.class).block();
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = objectMapper.readValue(responseBody, new TypeReference<Map<String, String>>() {});
        return map.get("price");
    }
}
