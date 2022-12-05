//FuncAdm é subclasse de Funcionario e também de forma indireta de Pessoa
public class FuncAdm extends Funcionario {

    private String setor;
    private String funcao;

    //Construtor com parâmetros
    public FuncAdm(String nome, int idade, String endereco, double salario, String setor, String funcao) {
        super(nome, idade, endereco, salario);
        this.setor = setor;
        this.funcao = funcao;
    }

    //Cosntrutor sem parâmetros
    public FuncAdm() { }

    //Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
