package JustinYoo.CoinTrader;

import JustinYoo.CoinTrader.exchange.Binance;
import JustinYoo.CoinTrader.exchange.Upbit;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @Test
    void trade() throws JsonProcessingException {
        Upbit upbit = new Upbit();
        Binance binance = new Binance();

        //BigDecimal arbitrage = upbit.getPrice("KRW-TRX");
        //arbitrage.subtract(binance.getPrice("TRXUSDT"));
        //System.out.println("arbitrage = " + arbitrage);

        BigDecimal price = binance.getPrice("TRXUSDT");
        System.out.println(price);
        //given
        //when
        //then
    }
}