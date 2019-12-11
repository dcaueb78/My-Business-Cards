package network;

import network.response.CardsResult;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CardsService {
    @GET("/cards")
    Call<CardsResult> obterCardsPopulares();
}
