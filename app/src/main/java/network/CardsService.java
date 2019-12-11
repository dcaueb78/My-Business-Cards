package network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CardsService {
    @GET("users/dcaueb78/repos")
    Call<ResponseBody> obterCardsPopulares();
}
