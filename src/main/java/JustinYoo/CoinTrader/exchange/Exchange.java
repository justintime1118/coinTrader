package JustinYoo.CoinTrader.exchange;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Getter;

@Getter
public abstract class Exchange {
    private String priceBit;
    private String priceEther ;

    public abstract int buy(String coinName, long price);
    public abstract int sell(String coinName, long price);
    public abstract String getPrice(String coinName) throws JsonProcessingException;
}
