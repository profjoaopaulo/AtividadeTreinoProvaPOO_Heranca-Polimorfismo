//Funcionario é subclasse de Pessoa
public class Funcionario extends Pessoa {

    private double salario;

    //Construtor com parâmetros
    public Funcionario(String nome, int idade, String endereco, double salario) {
        super(nome, idade, endereco);
        this.salario = salario;
    }

    //Construtor sem parâmetros
    public Funcionario() { }

    //Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
}
