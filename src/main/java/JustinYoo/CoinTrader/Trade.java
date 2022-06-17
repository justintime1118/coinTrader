package JustinYoo.CoinTrader;

import JustinYoo.CoinTrader.exchange.Exchange;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Trade {
    private final Exchange domesticExchange;
    private final Exchange foreignExchange;

    @Scheduled
    public void Routine() {
        if ()
    }
}

//루틴 메서드 {
//- 차익 계산. 각 거래소의 멤버 변수를 통해 계산하면 됨. 김치 프리미엄 구하는 공식을 이용하자
//- (조건 부) 주문 체결. 각 거래소 메서드를 호출해주면 됨
//}