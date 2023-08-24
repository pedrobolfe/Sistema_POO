import java.util.ArrayList;
import java.util.Arrays;

public class UsaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Peter Parker", "peterparker@gmail.com", "Queens, New York", "915633874", "Secretário",1200.65);

        ArrayList<String> dependentes_lista = new ArrayList<String>(Arrays.asList("dependente1", "dependente2", "dependente3"));
        ArrayList<String> dadosPagemento_lista = new ArrayList<String>(Arrays.asList("true","pix"));

        funcionario1.cadastrarAssociado("bruce banner","banner@hotmail.com","avenida das pombas","69357841",dadosPagemento_lista,dependentes_lista);

    
        funcionario1.cadastrarAssociado("kurt kobain","banner@hotmail.com","avenida das pombas","69357841",dadosPagemento_lista,dependentes_lista);

        String cadastrados = funcionario1.getAssociadosCadastrados();
        System.out.println(cadastrados);

            
        }

        
        



    }
    
