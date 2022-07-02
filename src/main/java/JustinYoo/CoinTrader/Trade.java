package JustinYoo.CoinTrader;

import JustinYoo.CoinTrader.exchange.Exchange;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class Trade {
    private final Exchange upbit;
    private final Exchange binance;

    //@Scheduled
    public void trade() {
        BigDecimal arbitrage = upbit.getPrice("KRW-TRX");
        arbitrage.subtract(binance.getPrice("TRXUSDT"));
        System.out.println("arbitrage = " + arbitrage);
        // (조건부) 알림 보내기
        // (조건부) 주문 넣기
    }
}