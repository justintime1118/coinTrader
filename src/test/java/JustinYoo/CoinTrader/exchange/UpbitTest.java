package JustinYoo.CoinTrader.exchange;

import JustinYoo.CoinTrader.dataClass.BinancePriceTicker;
import JustinYoo.CoinTrader.dataClass.UpbitTicker;
import org.junit.jupiter.api.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UpbitTest {

    @Test
    void buy() {
    }

    @Test
    void sell() {
    }

    @Test
    void getPrice() {
        String coinName = "KRW-TRX";

        WebClient.ResponseSpec responseSpec =  WebClient.create().get().
        uri("https://api.upbit.com/v1/ticker?markets=" + coinName)
        .retrieve();
        // 런타임 시에 타입을 특정할 수 있어야 하는데 컴파일 과정에서 지네릭스 타입이 사라지는 것 때문에 parameterizedTypeReference를 써야 한다고 함
        // (https://stackoverflow.com/questions/48598233/deserialize-a-json-array-to-objects-using-jackson-and-webclient)
        UpbitTicker upbitTicker = responseSpec.bodyToMono(new ParameterizedTypeReference<List<UpbitTicker>>() {
        }).block().get(0);
        System.out.println("upbitTicker = " + upbitTicker); // 왜 일부는 값이 잘 담기고 일부는 안될까...?
    }
}