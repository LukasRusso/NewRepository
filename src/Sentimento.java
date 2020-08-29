public enum Sentimento {

    BEM("bem"),
    FELIZ("feliz"),
    CANSADO("cansado"),
    TRISTE("triste");

    private String descricao;

    Sentimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
