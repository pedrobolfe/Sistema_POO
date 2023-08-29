import java.util.ArrayList;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Peter Parker", "peterparker@gmail.com", "Queens, New York", "915633874", "Secretário", 1200.65);

        String dependentes = "aaaa";
        String dependentes2 = "bbbb";
        ArrayList<String> atividadesEsportivas= new ArrayList<String>();

        funcionario1.cadastrarAssociado("a", "aaaaa", "aaa", "aaaaaaaaaa", "pix", dependentes, atividadesEsportivas);
        funcionario1.cadastrarAssociado("pedro", "aaaaa", "aaa", "aaaaaaaaaa", "pix", dependentes2, atividadesEsportivas);
      
        String cadastrados = funcionario1.listarAssociados();
        System.out.println(cadastrados);        
    }
}
