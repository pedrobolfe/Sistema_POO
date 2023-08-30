import java.util.ArrayList;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gedervaldo Cunha Silveira", "gedervaldocunha45@gmail.com", "Rua Inacio, 791", "98856-7845", "Secretário", 1200.65);
        Funcionario funcionario2 = new Funcionario("Adelinha de Carvalho Espernça", "linacarvalho7@gmail.com", "Rua Tupiaçi, 1246", "98889-7416", "GERENTE", 2648.49);

        Dependente dependentes = new Dependente("Vlaisson Mercau Cistina", "vlaissonmercau69@gmail.com", "Rua Finaldo Cunha, 49", "98846-15748", 14);
        Dependente dependentes2 = new Dependente("Clebeia Costa da Luz", "leialuz999@hotmail.com", "Rua Euseila, 798", "98846-1556", 9);
        ArrayList<Dependente> dependentesLista= new ArrayList<Dependente>();
        dependentesLista.add(dependentes);
        ArrayList<String> atividadesEsportivas= new ArrayList<String>();
        atividadesEsportivas.add("natação");

        funcionario1.cadastrarAssociado("Adenilson Pereira Borges", "pereiraade123@outlook.com", "Rua Xablau,784", "988874-5644", "pix", dependentesLista, atividadesEsportivas);
        funcionario1.cadastrarAssociado("Judineia Pinto Alessa", "juineialessa@gmail.com", "Rua Zezinho Costa, 951", "98824-5132", "debito", dependentesLista, atividadesEsportivas);
      
        String cadastrados = funcionario1.listarAssociados();
        System.out.println(cadastrados);        
    }
}
