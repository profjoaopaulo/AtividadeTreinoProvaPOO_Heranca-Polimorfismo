//Aluno é subclasse de Pessoa 
public class Aluno extends Pessoa {
    
        private String semestre;
        private String curso;

        //Construtor com parâmetros
        public Aluno(String nome, int idade, String endereco, String semestre, String curso) {
            super(nome, idade, endereco);
            this.semestre = semestre;
            this.curso = curso;
        }

        //Construtor sem parâmetros
        public Aluno() { }

        //Getters e Setters
        public String getSemestre() {
            return semestre;
        }

        public void setSemestre(String semestre) {
            this.semestre = semestre;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }   
}
