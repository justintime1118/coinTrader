package JustinYoo.CoinTrader.exchange;

import org.springframework.stereotype.Component;

@Component
public class Upbit implements Exchange{

    long priceBit;
    long priceEther;

    public Upbit() {
        // 각 거래소 시세조회 api로 구현해놓기
        priceBit = ;
        priceEther = ;
    }

    @Override
    public void buy(long price) {

    }

    @Override
    public void sell(long price) {

    }
}
