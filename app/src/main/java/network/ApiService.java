package network;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ApiService {

    private static CardsService INSTANCE;

    public static CardsService getInstance() {
        if(INSTANCE == null ) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build();

            INSTANCE = retrofit.create(CardsService.class);

        }
        return INSTANCE;
    }
}
