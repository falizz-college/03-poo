import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> turma = new ArrayList<>();

    public void criarTurma (Professor professor, Disciplina disciplina){
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public void matricularAlunos(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            if (aluno.getCurso() == disciplina.getCurso()) {
                turma.add(aluno);
            }
        }
    }

    public void informacoesTurma() {
        System.out.println("========================================");
        System.out.println("Informações da Turma: ");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Alunos Matriculados:");
        for (Aluno aluno : turma) {
            System.out.println(" * " + aluno.getNome());
        }
        System.out.println("========================================");
        System.out.print("\n");
    }
}
