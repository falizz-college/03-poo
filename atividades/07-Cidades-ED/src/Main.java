import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cidade> cidades = new ArrayList<>();

        // Adicionando cidades
        Cidade Anapolis = new Cidade("GO","Anápolis",false);
        cidades.add(Anapolis);
        
        Cidade Goiania = new Cidade("GO","Goiânia",true);
        cidades.add(Goiania);
        
        Cidade RibeiraoPreto = new Cidade("SP", "Ribeirão Preto",false);
        cidades.add(RibeiraoPreto);
        
        Cidade Campinas = new Cidade("SP", "Campinas",false);
        cidades.add(Campinas);
        
        Cidade BeloHorizonte = new Cidade("MG","Belo Horizonte",true);
        cidades.add(BeloHorizonte);
        
        Cidade Uberlandia = new Cidade("MG","Uberlândia",false);
        cidades.add(Uberlandia);
        
        Cidade MontesClaros = new Cidade("MG","Montes Claros",false);
        cidades.add(MontesClaros);
        
        Cidade Unai = new Cidade("MG","Unaí",false);
        cidades.add(Unai);
        
        Cidade Palmas = new Cidade("TO","Palmas",true);
        cidades.add(Palmas);
        
        Cidade Araguari = new Cidade("TO","Araguarí",false);
        cidades.add(Araguari);
        
        Cidade Cuiaba = new Cidade("MT","Cuiabá",true);
        cidades.add(Cuiaba);
        
        Cidade Dourados = new Cidade("MS","Dourados",false);
        cidades.add(Dourados);
        
        Cidade CampoGrande = new Cidade("MS","Campo Grande",true);
        cidades.add(CampoGrande);
        
        Cidade Corumba = new Cidade("MS","Corumbá",false);
        cidades.add(Corumba);
        
        Cidade BarraDoGarcas = new Cidade("MT","Barra do Garças",false);
        cidades.add(BarraDoGarcas);
        
        Cidade Araguaiana = new Cidade("MT","Araguaiana",false);
        cidades.add(Araguaiana);
        
        Cidade PortoVelho = new Cidade("RO","Porto Velho",true);
        cidades.add(PortoVelho);
        
        Cidade CostaMarques = new Cidade("RO","CostaMarques",false);
        cidades.add(CostaMarques);

        // Aplicando cada estrutura

        // Aplicando a primeira estrutura
        Estrutura1 estrutura1 = new Estrutura1();
        estrutura1.inserirMapa(cidades);
        estrutura1.exibirMapa();

        System.out.println("\n\n---------------------------------------------\n\n");

        // Aplicando a segunda estrutura
        Estrutura2 estrutura2 = new Estrutura2();
        estrutura2.inserirCidades(cidades);
        estrutura2.exibirCidades();

        System.out.println("\n\n---------------------------------------------\n\n");

        // Aplicando a terceira estrutura
        Estrutura3 estrutura3 = new Estrutura3();
        estrutura3.inserirCidades(cidades);
        estrutura3.exibirCidades();

    }
}