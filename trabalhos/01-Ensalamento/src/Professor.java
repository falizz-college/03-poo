public class Professor extends Pessoa{
    private Disciplina disciplina;

    public void criarProfessor(String nome, Disciplina disciplina){
        this.nome = nome;
        this.disciplina = disciplina;
    }
}
