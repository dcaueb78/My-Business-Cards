package data.model;

public class Card {

    private final String nome;

    private final String descricao;

    private final String contato;

    public Card(String nome, String descricao, String contato) {
        this.nome = nome;
        this.descricao = descricao;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getContato() {
        return contato;
    }
}
