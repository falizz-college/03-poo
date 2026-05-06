import java.util.ArrayList;
import java.util.List;

public class Ensalamento {

    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void ensalar(){

        // INSTANCIANDO CURSOS

        Curso ti = new Curso();
        Curso adm = new Curso();

        // CRIANDO DISCIPLINAS

        Disciplina POO = new Disciplina();
        POO.criarDisciplina("POO", ti);

        Disciplina estruturaDados = new Disciplina();
        estruturaDados.criarDisciplina("Estrutura de Dados", ti);

        Disciplina BI = new Disciplina();
        BI.criarDisciplina("BI", adm);

        // CRIANDO CURSOS

        ti.criarCurso("TI");
        ti.novaDisciplina(POO);
        ti.novaDisciplina(estruturaDados);

        adm.criarCurso("ADM");
        adm.novaDisciplina(BI);

        // CRIANDO OS ALUNOS

        Aluno aluno1 = new Aluno();
        aluno1.criarAluno("Alfredo", ti);
        alunos.add(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.criarAluno("Amélia", ti);
        alunos.add(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.criarAluno("Ana", adm);
        alunos.add(aluno3);

        Aluno aluno4 = new Aluno();
        aluno4.criarAluno("Bruno", ti);
        alunos.add(aluno4);

        Aluno aluno5 = new Aluno();
        aluno5.criarAluno("Bentinho", adm);
        alunos.add(aluno5);

        Aluno aluno6 = new Aluno();
        aluno6.criarAluno("Capitú", ti);
        alunos.add(aluno6);

        Aluno aluno7 = new Aluno();
        aluno7.criarAluno("Debora", ti);
        alunos.add(aluno7);

        Aluno aluno8 = new Aluno();
        aluno8.criarAluno("Ian", adm);
        alunos.add(aluno8);

        Aluno aluno9 = new Aluno();
        aluno9.criarAluno("Iracema", ti);
        alunos.add(aluno9);

        Aluno aluno10 = new Aluno();
        aluno10.criarAluno("Joelmir", adm);
        alunos.add(aluno10);

        Aluno aluno11 = new Aluno();
        aluno11.criarAluno("Julieta", ti);
        alunos.add(aluno11);

        Aluno aluno12 = new Aluno();
        aluno12.criarAluno("Luana", adm);
        alunos.add(aluno12);

        Aluno aluno13 = new Aluno();
        aluno13.criarAluno("Luciana", ti);
        alunos.add(aluno13);

        Aluno aluno14 = new Aluno();
        aluno14.criarAluno("Majô", adm);
        alunos.add(aluno14);

        Aluno aluno15 = new Aluno();
        aluno15.criarAluno("Maria", adm);
        alunos.add(aluno15);

        Aluno aluno16 = new Aluno();
        aluno16.criarAluno("Norberto", ti);
        alunos.add(aluno16);

        Aluno aluno17 = new Aluno();
        aluno17.criarAluno("Paulo", adm);
        alunos.add(aluno17);

        Aluno aluno18 = new Aluno();
        aluno18.criarAluno("Romeu", adm);
        alunos.add(aluno18);

        Aluno aluno19 = new Aluno();
        aluno19.criarAluno("Wendel", ti);
        alunos.add(aluno19);

        Aluno aluno20 = new Aluno();
        aluno20.criarAluno("Zoey", ti);
        alunos.add(aluno20);

        // CRIANDO PROFESSORES

        Professor professor1 = new Professor();
        professor1.criarProfessor("Mia", POO);

        Professor professor2 = new Professor();
        professor2.criarProfessor("Saulo", estruturaDados);

        Professor professor3 = new Professor();
        professor3.criarProfessor("Paula", BI);

        // CRIANDO TURMAS

        Turma turmaMia = new Turma();
        turmaMia.criarTurma(professor1, POO);

        Turma turmaSaulo = new Turma();
        turmaSaulo.criarTurma(professor2, estruturaDados);

        Turma turmaPaula = new Turma();
        turmaPaula.criarTurma(professor3, BI);

        // VENDO INFORMAÇÕES DE CADA TURMA

        turmaMia.matricularAlunos(alunos);
        turmaMia.informacoesTurma();

        turmaSaulo.matricularAlunos(alunos);
        turmaSaulo.informacoesTurma();

        turmaPaula.matricularAlunos(alunos);
        turmaPaula.informacoesTurma();
    }
}
