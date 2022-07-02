package JustinYoo.CoinTrader.exchange;

import JustinYoo.CoinTrader.dataClass.BinancePriceTicker;
import JustinYoo.CoinTrader.dataClass.UpbitTicker;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;

@Component
public class Upbit implements Exchange {


    public int buy(String coinName, long price) {
        System.out.println("Upbit: " + "buy " + coinName + " at " + price);
        return 0;
    }

    public int sell(String coinName, long price) {
        System.out.println("Upbit: " + "sell " + coinName + " at " + price);
        return 0;
    }

    public BigDecimal getPrice(String coinName) {
        WebClient webClient = WebClient.create();
        WebClient.ResponseSpec responseSpec = webClient.get()
                .uri("https://api.upbit.com/v1/ticker?markets=" + coinName)
                .retrieve();
        BigDecimal price = responseSpec.bodyToFlux(UpbitTicker.class).blockFirst().getTradePrice();

        return price;
    }
}
