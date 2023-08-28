import java.util.ArrayList;
import java.util.Arrays;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Peter Parker", "peterparker@gmail.com", "Queens, New York", "915633874", "Secretário", 1200.65);

        String dependentes = "aaaa";
        ArrayList<String> atividadesEsportivas= new ArrayList<String>();

        funcionario1.cadastrarDados("a", "aaaaa", "aaa", "aaaaaaaaaa", "pix", dependentes, atividadesEsportivas);
        funcionario1.cadastrarDados("pedro", "aaaaa", "aaa", "aaaaaaaaaa", "pix", dependentes, atividadesEsportivas);
        funcionario1.cadastroFuncionario("pedro", "aaaaa", "aaa", "aaaaaaaaaa", "pix",222.6);
        String cadastrados = funcionario1.listarInfo();
        System.out.println(cadastrados);        
    }
}
