import java.util.ArrayList;

public class UsaAssociado {
    public static void main(String[] args){

    // Exemplo de uso
    ArrayList<String> atividades = new ArrayList<String>();
    atividades.add("Futebol");
    atividades.add("Natação");
    
    
    ArrayList<Dependente> dependentes = new ArrayList<>();
    // Adicione dependentes se necessário

    Associado associado = new Associado("João", "joao@email.com", "Rua A", "123456789", "01/2023", dependentes, atividades);
    }
   

    
}
