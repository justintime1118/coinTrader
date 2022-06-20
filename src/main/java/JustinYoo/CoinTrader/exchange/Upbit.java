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
public class Upbit extends Exchange {

    private String priceBit;
    private String priceEther ;

    public Upbit() throws JsonProcessingException {
        this.priceBit = getPrice("USDT-BTC");
        this.priceEther = getPrice("USDT-ETH");
    }

    // 각 거래소 주문 api로 구현해놓기
    @Override
    public int buy(String coinName, long price) {
        System.out.println("Upbit: " + "buy " + coinName + " at " + price);
        return 0;
    }

    @Override
    public int sell(String coinName, long price) {
        System.out.println("Upbit: " + "sell " + coinName + " at " + price);
        return 0;
    }

    @Override
    public String getPrice(String coinName) throws JsonProcessingException {
        WebClient webClient = WebClient.create();
        WebClient.ResponseSpec responseSpec = webClient.get()
                .uri("https://api.upbit.com/v1/ticker?markets=" + coinName)
                .retrieve();
        String responseBody = responseSpec.bodyToMono(String.class).block();
        responseBody = responseBody.substring(1, responseBody.length() - 1);
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = objectMapper.readValue(responseBody, new TypeReference<Map<String, String>>() {});
        return map.get("trade_price");
    }
}
