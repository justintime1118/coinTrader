package JustinYoo.CoinTrader.exchange;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public interface Exchange {
    public int buy(String coinName, long price);
    public int sell(String coinName, long price);
    public BigDecimal getPrice(String coinName);
}