package JustinYoo.CoinTrader.dataClass;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpbitTicker {
    private String market;
    private String tradeDate;
    private String tradeTime;
    private String tradeDateKst;
    private String tradeTimeKst;
    private Long tradeTimestamp;
    private BigDecimal openingPrice;
    private BigDecimal highPrice;
    private BigDecimal lowPrice;
    private BigDecimal tradePrice;
    private BigDecimal prevClosingPrice;
    private String change;
    private BigDecimal changePrice;
    private BigDecimal changeRate;
    private BigDecimal signedChangePrice;
    private BigDecimal signedChangeRate;
    private BigDecimal tradeVolume;
    private BigDecimal accTradePrice;
    private BigDecimal accTradePrice24h;
    private BigDecimal accTradeVolume;
    private BigDecimal accTradeVolume24h;
    private BigDecimal highest52weekPrice;
    private String highest52weekDate;
    private BigDecimal lowest52weekPrice;
    private String lowest52weekDate;
    private Long timestamp;
}