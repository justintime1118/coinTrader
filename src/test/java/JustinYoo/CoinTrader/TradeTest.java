package JustinYoo.CoinTrader;

import JustinYoo.CoinTrader.exchange.Binance;
import JustinYoo.CoinTrader.exchange.Upbit;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @Test
    void trade() throws JsonProcessingException {
        Upbit upbit = new Upbit();
        Binance binance = new Binance();

        double arbitrage = Double.parseDouble(binance.getPriceBit()) - Double.parseDouble(upbit.getPriceBit());
        System.out.println("arbitrage0 = " + arbitrage);
        double arbitrage1 = Double.parseDouble(binance.getPriceBit()) - Double.parseDouble(upbit.getPriceBit());
        System.out.println("arbitrage1 = " + arbitrage);
        double arbitrage2 = Double.parseDouble(binance.getPriceBit()) - Double.parseDouble(upbit.getPriceBit());
        System.out.println("arbitrage2 = " + arbitrage);
    }
}