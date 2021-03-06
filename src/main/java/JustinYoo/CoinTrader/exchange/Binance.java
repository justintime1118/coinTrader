package JustinYoo.CoinTrader.exchange;

import JustinYoo.CoinTrader.dataClass.BinancePriceTicker;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;

@Component
public class Binance implements Exchange {

    public int buy(String coinName, long price) {
        System.out.println("Binance: " + "buy " + coinName + " at " + price);
        return 0;
    }

    public int sell(String coinName, long price) {
        System.out.println("Binance: " + "sell " + coinName + " at " + price);
        return 0;
    }

    public BigDecimal getPrice(String coinName) {
        WebClient webClient = WebClient.create();
        WebClient.ResponseSpec responseSpec = webClient.get()
                .uri("https://www.binance.com/api/v3/ticker/price?symbol=" + coinName)
                .retrieve();
        BigDecimal price = responseSpec.bodyToMono(BinancePriceTicker.class).block().getPrice();
        return price;
    }
}
