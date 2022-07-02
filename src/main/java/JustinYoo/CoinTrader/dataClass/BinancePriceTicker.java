package JustinYoo.CoinTrader.dataClass;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BinancePriceTicker {
    private String symbol;
    private BigDecimal price;
}
