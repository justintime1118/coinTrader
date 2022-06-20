package JustinYoo.CoinTrader.exchange;


import com.fasterxml.jackson.core.JsonProcessingException;

public interface OldExchange {
    public int buy(String coinName, long price);
    public int sell(String coinName, long price);
    public String getPrice(String coinName) throws JsonProcessingException;
}