package JustinYoo.CoinTrader;

import okhttp3.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
public class CoinTraderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CoinTraderApplication.class, args);

		//Jwt jwt = new Jwt();
		//String jwtToken = jwt.jwtInit();
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
		.url("https://api.upbit.com/v1/ticker?markets=KRW-BTC")
		.get()
		.addHeader("Accept", "application/json")
		.build();
		Response response = client.newCall(request).execute();
		System.out.println(response);
	}
}

