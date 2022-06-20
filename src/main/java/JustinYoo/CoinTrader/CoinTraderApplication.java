package JustinYoo.CoinTrader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoinTraderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinTraderApplication.class, args);
	}
}

// [나의 잔고 조회를 통해 만일 손실이 나고 있다면 앱을 정지시키는 기능도 추후에 넣자]