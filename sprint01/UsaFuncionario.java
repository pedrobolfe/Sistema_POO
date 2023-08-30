import java.util.ArrayList;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Peter Parker", "peterparker@gmail.com", "Queens, New York", "915633874", "Secretário", 1200.65);
        Funcionario funcionario2 = new Funcionario("Peter Parker", "peterparker@gmail.com", "Queens, New York", "915633874", "GERENTE", 1200.65);

        Dependente dependentes = new Dependente("Pedroo", "miotto", "rua", "666", 10);
        Dependente dependentes2 = new Dependente("Pedroo", "miotto", "rua", "666",10);
        ArrayList<Dependente> dependentesLista= new ArrayList<Dependente>();
        dependentesLista.add(dependentes);
        ArrayList<String> atividadesEsportivas= new ArrayList<String>();
        atividadesEsportivas.add("hello there");

        funcionario1.cadastrarAssociado("a", "aaaaa", "aaa", "aaaaaaaaaa", "pix", dependentesLista, atividadesEsportivas);
        funcionario1.cadastrarAssociado("pedro", "aaaaa", "aaa", "aaaaaaaaaa", "pix", dependentesLista, atividadesEsportivas);
      
        String cadastrados = funcionario1.listarAssociados();
        System.out.println(cadastrados);        
    }
}
