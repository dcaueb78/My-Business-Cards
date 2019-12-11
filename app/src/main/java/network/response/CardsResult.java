package network.response;

import com.squareup.moshi.Json;

import java.util.List;

public class CardsResult {
    @Json(name = "login")
    private final List<CardsResponse> resultadoCards;

    public CardsResult(List<CardsResponse> resultadoCards) {
        this.resultadoCards = resultadoCards;
    }

    public List<CardsResponse> getResultadoCards() {
        return resultadoCards;
    }
}
