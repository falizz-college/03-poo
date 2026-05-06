import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Estrutura1 {
    Map<String, Set<String>> mapa = new HashMap<>();

    void inserirMapa(ArrayList<Cidade> cidades) {
        for (Cidade cidade : cidades) {
            mapa.computeIfAbsent(cidade.getUf(), uf -> new TreeSet<>()).add(cidade.getNome());
        }
    }

    void exibirMapa() {
        for (Map.Entry<String, Set<String>> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ":");

            for (String cidade : entrada.getValue()) {
                System.out.println("  " + cidade);
            }
        }
    }

}
