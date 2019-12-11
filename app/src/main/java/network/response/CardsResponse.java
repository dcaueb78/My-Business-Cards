package network.response;

import com.squareup.moshi.Json;

public class CardsResponse {

    @Json(name = "nome")
    private final String Nome;

    @Json(name = "contato")
    private final String Contato;

    public CardsResponse(String nome, String contato) {
        Nome = nome;
        Contato = contato;
    }

    public String getNome() {
        return Nome;
    }

    public String getContato() {
        return Contato;
    }
}
