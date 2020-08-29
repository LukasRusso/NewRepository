public class Pessoa {
    private String nome;
    private int idade;
    private Sentimento sentimento;

    public Pessoa(String nome, int idade, Sentimento sentimento){
        this.nome = nome;
        this.idade = idade;
        this.sentimento = sentimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sentimento getSentimento() {
        return sentimento;
    }

    public void setSentimento(Sentimento sentimento) {
        this.sentimento = sentimento;
    }

    public void dizerOla(Pessoa p){
        System.out.println(this.getNome() + ": Olá!");
        p.responderOla(this);
    }

    public void responderOla(Pessoa p){
        System.out.println(this.nome + ": Olá!");
    }

    public void apresentar_se(Pessoa p){
        System.out.println(this.getNome() + ": Meu nome é " + this.getNome() + ", tenho " + this.getIdade() + " anos, e você?");
        p.responderApresentacao(this);
        System.out.println(this.getNome() + ": O prazer é meu!");
    }

    public void responderApresentacao(Pessoa p){
        if(this.getIdade() == p.getIdade())
            System.out.println(this.getNome() + ": Meu nome é " + this.getNome() + ", tenho " + this.getIdade() + " anos também! rs");
        else
            System.out.println(this.getNome() + ": Meu nome é " + this.getNome() + ", tenho " + this.getIdade() + " anos. Prazer em conhecê-lo");
    }

    public void dizerSentrimento(Pessoa p){
        System.out.println(this.getNome() + ": tudo bem?");
        p.responderSentimento(this);
        System.out.println(this.getNome() + " Estou " + this.getSentimento().getDescricao() + ", obrigado.");
    }

    public void responderSentimento(Pessoa p){
        System.out.println(this.getNome() + ": Estou " + this.getSentimento().getDescricao() + ", obrigado por perguntar. E você?");
    }
}



