import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Estrutura2 {
    PriorityQueue<Cidade> filaCidades;

    public Estrutura2() {
        this.filaCidades = new PriorityQueue<>(new Comparator<Cidade>() {
            @Override
            public int compare(Cidade c1, Cidade c2) {
                if (c1.getCapital() && !c2.getCapital()) {
                    return -1;
                } else if (!c1.getCapital() && c2.getCapital()) {
                    return 1;
                }
                return c1.getNome().compareTo(c2.getNome());
            }
        });
    }

    public void inserirCidades(ArrayList<Cidade> cidades) {
        this.filaCidades.addAll(cidades);
    }

    public void exibirCidades() {
        while (!filaCidades.isEmpty()) {
            Cidade cidade = filaCidades.poll();
            System.out.print(cidade.getNome() + " - " + cidade.getUf());
            if(cidade.getCapital()){
                System.out.print(" Capital");
            }
            System.out.println(" ");
        }
    }
}