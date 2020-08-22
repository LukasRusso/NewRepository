public class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void dizerOla(Pessoa p){
        System.out.println(this.getNome() + ": Olá, " + p.nome + "!");
        p.responderOla(this);
    }

    public void responderOla(Pessoa p){
        System.out.println(this.nome + ": Olá, " + p.nome + ".");
    }
}
