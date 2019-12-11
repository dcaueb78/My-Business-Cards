package data.model;

public class Card {

    private final String nome;

    private final String descricao;

    public Card(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao(){ return descricao; }

}
