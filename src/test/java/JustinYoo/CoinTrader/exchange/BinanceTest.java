package JustinYoo.CoinTrader.exchange;

import JustinYoo.CoinTrader.dataClass.BinancePriceTicker;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;

class BinanceTest {

    @Test
    void buy() {
    }

    @Test
    void sell() {
    }

    @Test
    void getPrice() {
        String coinName = "TRXUSDT";

        WebClient webClient = WebClient.create();
        WebClient.ResponseSpec responseSpec = webClient.get()
                .uri("https://www.binance.com/api/v3/ticker/price?symbol=" + coinName)
                .retrieve();
        BigDecimal price = responseSpec.bodyToMono(BinancePriceTicker.class).block().getPrice();
        System.out.println("price = " + price);
    }
}