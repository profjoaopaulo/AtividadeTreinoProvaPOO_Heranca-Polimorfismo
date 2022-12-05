public class Main {
    
    public static void main(String[] args) {
        
        //Observe que se configura também os atributos das superclasses Pessoa e Funcionario
        Aluno aluno = new Aluno("Beltrano", 20, "Rua da Saudade", "2022.2", "Técnico em Informática");
        Professor professor = new Professor("Raimundo", 60, "Rua do O Salário, Oh!", 1000, "POO");
        FuncAdm funcAdm = new FuncAdm("Cicrano", 30, "Rua administrativa", 1000, "Biblioteca", "bibliotecário");

        //Através dos métodos Getters, pode-se obter os valores dos atributos antes configurados nos métodos Setters ou Construtores
        //Note também que nos objetos são acessados métodos que estão declarados em suas superclasses (Herança)
        System.out.println("\n\nDados do aluno:\nNome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade() 
        + "\nEndereço: " + aluno.getEndereco() + "\nSemestre: " + aluno.getSemestre() + "\nCurso: "
        + aluno.getCurso());
        System.out.println("\n\nDados do professor:\nNome: " + professor.getNome() + "\nIdade: " 
        + professor.getIdade() + "\nEndereço: " + professor.getEndereco() + "\nDisciplina: " 
        + professor.getDisciplina());
        System.out.println("\n\nDados do funcionário administrativo:\nNome: " + funcAdm.getNome() 
        + "\nIdade: " + funcAdm.getIdade() + "\nEndereço: " + funcAdm.getEndereco() 
        + "\nDisciplina: " + funcAdm.getSalario() + "\nSetor: " + funcAdm.getSetor() + "\nFunção: " 
        + funcAdm.getFuncao());

        //Foi usado os dados direto no código, para ficar mais curto o código. Mas use à vontade a leitura com o objeto Scanner
    }
}
