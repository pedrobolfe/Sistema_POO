import java.util.ArrayList;

public class UsaFuncionario {
    public static void main(String[] args) {
        
        ArrayList<String> empregosAntigos = new ArrayList<String>();
        ArrayList<String> feedbacksFuncionario = new ArrayList<String>();

        empregosAntigos.add("TELEMARKETING");
        empregosAntigos.add("RECEPEÇÃO");

        feedbacksFuncionario.add("EXPERIENTE"  );
        feedbacksFuncionario.add("MATURIDADE");
        
        Funcionario funcionario1 = new Funcionario("Gedervaldo Cunha Silveira", "gedervaldocunha45@gmail.com", "Rua Inacio, 791", "(45) 988567845", "Secretário", 1200.65, empregosAntigos, feedbacksFuncionario);
        Funcionario funcionario2 = new Funcionario("Adelinha de Carvalho Esperança", "linacarvalho7@gmail.com", "Rua Tupiacu, 1246", "45 98889-7416", "GERENTE", 2648.49, empregosAntigos, feedbacksFuncionario);

        Dependente dependentes = new Dependente("Vlaisson Mercau Cistina", "vlaissonmercau69@gmail.com", "Rua Finaldo Cunha, 49", "(45) 9884615748", 14);
        Dependente dependentes2 = new Dependente("Clebeia Costa da Luz", "leialuz999@hotmail.com", "Rua Euseila, 798", "4598846-1556", 9);
        ArrayList<Dependente> dependentesLista= new ArrayList<Dependente>();
        dependentesLista.add(dependentes);
        ArrayList<String> atividadesEsportivas= new ArrayList<String>();
        atividadesEsportivas.add("natação");

        funcionario1.cadastrarAssociado("Adenilson Pereira Borges", "pereiraade123@outlook.com", "Rua Xablau,784", "459888745644", "pix", dependentesLista, atividadesEsportivas);
        funcionario1.cadastrarAssociado("Judineia Pinto Alessa", "juineialessa@gmail.com", "Rua Zezinho Costa, 951", "(45)98824-5132", "debito", dependentesLista, atividadesEsportivas);
      
        String cadastrados = funcionario1.listarAssociados();
        //testando o metodo
        String resumoFuncionario = funcionario2.resumoFuncionarios();
        System.out.println(cadastrados);
        System.out.println(resumoFuncionario);        
    }
}
