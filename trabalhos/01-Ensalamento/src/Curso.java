import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public void criarCurso (String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public void novaDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
}
