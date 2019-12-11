package network;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ApiService {

    private static CardsService INSTANCE;

    public static CardsService getInstance() {
        if(INSTANCE == null ) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://localhost:3333")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build();

            INSTANCE = retrofit.create(CardsService.class);

        }
        return INSTANCE;
    }
}
