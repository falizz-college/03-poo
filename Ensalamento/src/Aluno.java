public class Aluno extends Pessoa {
    private Curso curso;

    public void criarAluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
}