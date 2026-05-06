public class Disciplina {
    private String nome;
    private Curso curso;

    public void criarDisciplina (String nome, Curso curso){
        this.nome = nome;
        this.curso = curso;
    }

    public Curso getCurso(){
        return curso;
    }

    public String getNome(){
        return nome;
    }
}
