package JustinYoo.CoinTrader;

import JustinYoo.CoinTrader.exchange.Exchange;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Trade {
    private final Exchange upbit;
    private final Exchange binance;

    //@Scheduled
    public void trade() {
        double arbitrage = Double.parseDouble(upbit.getPriceBit()) - Double.parseDouble(binance.getPriceBit());
        System.out.println("arbitrage = " + arbitrage);
        // (조건부) 알림 보내기
        // (조건부) 주문 넣기
    }
}