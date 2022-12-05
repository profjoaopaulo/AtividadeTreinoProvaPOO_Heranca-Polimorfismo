public class Pessoa {

    private String nome;
    private int idade;
    private String endereco;

    //Construtor com parâmetros
    public Pessoa(String nome, int idade, String endereco) {

        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    //Construtor sem parâmetros
    public Pessoa() { }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }    
}
