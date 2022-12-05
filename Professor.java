//Professor é subclasse de Funcionario e também de forma indireta de Pessoa
public class Professor extends Funcionario {

    private String disciplina;

    //Construtor com parâmetros
    public Professor(String nome, int idade, String endereco, double salario, String disciplina) {
        super(nome, idade, endereco, salario);
        this.disciplina = disciplina;
    }

    //Construtor sem parâmetros
    public Professor() { }

    //Getters e Setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }    
}
