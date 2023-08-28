import java.util.ArrayList;
import java.util.Arrays;

public class Associado extends Pessoa {
    
    //atributos
    private ArrayList<String> atividadesEsportivas;
    private String dadosPagemento;
    private String dependentes;
    
    //construtor 
    public Associado(String nome, String email,String endereco,String telefone,String dadosPagemento,String dependentes,ArrayList<String> atividadesEsportivas){
        super(nome,email,telefone,endereco);
        this.dadosPagemento = dadosPagemento;
        this.dependentes = dependentes;
        this.atividadesEsportivas = atividadesEsportivas;
    }

    //getters  
    public String getDadosPagemento() {
        return dadosPagemento;
    }
    public ArrayList<String> getAtividadesEsportivas() {
        return atividadesEsportivas;
    }
   

    //setters
    public void setDadosPagemento(String dadosPagemento) {
        this.dadosPagemento = dadosPagemento;
    }
    public void setAtividadesEsportivas(ArrayList<String> atividadesEsportivas) {
        this.atividadesEsportivas = atividadesEsportivas;
    }
    // public void setDependentes(ArrayList<String> dependentes) {
    //     this.dependentes = dependentes;
    // }

    @Override
    public String toString(){
        String display = "\nNome: " + nome + "\nEmail: " + email + "\nEndereco: " + endereco + "\nTelefone: " + telefone + "\nDados Pagamento: "  + "\nDependentes: " + "\nAtividades esportivas: "+ Arrays.toString(atividadesEsportivas.toArray())+ "\n";
        return display;
    }
}
