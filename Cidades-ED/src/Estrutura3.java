import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Estrutura3 {
    private Set<Cidade> cidadesOrdenadas;

    public Estrutura3() {
        this.cidadesOrdenadas = new TreeSet<>(new Comparator<Cidade>() {
            @Override
            public int compare(Cidade c1, Cidade c2) {
                return c2.getNome().compareTo(c1.getNome());
            }
        });
    }

    public void inserirCidades(ArrayList<Cidade> cidades) {
        this.cidadesOrdenadas.addAll(cidades);
    }

    public void exibirCidades() {
        for (Cidade cidade : cidadesOrdenadas) {
            System.out.println(cidade.getNome() + " - " + cidade.getUf());
        }
    }
}
