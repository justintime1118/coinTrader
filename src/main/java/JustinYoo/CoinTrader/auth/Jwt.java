package JustinYoo.CoinTrader.auth;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.UUID;

public class Jwt {

    public String jwtInit() {
        String accessKey = "accessKey";
        String secretKey = "secretKey";

        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        String jwtToken = JWT.create()
                .withClaim("access_key", accessKey)
                .withClaim("nonce", UUID.randomUUID().toString())
                .sign(algorithm);

        String authenticationToken = "Bearer " + jwtToken;
        return (authenticationToken);
    }
}
