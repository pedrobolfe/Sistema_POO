import java.util.ArrayList;
import java.util.Arrays;

public class Associado extends Pessoa {
    
    //atributos
    private ArrayList<String> atividadesEsportivas;
    private String dadosPagemento;
    private ArrayList<Dependente> dependentes;
    
    //construtor 
    public Associado(String nome, String email,String endereco,String telefone,String dadosPagemento,ArrayList<Dependente> dependentes,ArrayList<String> atividadesEsportivas){
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
    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString(){
        String display =super.listarDados() + "Dados Pagamento: " +this.dadosPagemento + "\n"+"Dependentes: "+this.dependentes.toString() +"\n"+"Atividades esportivas: "+ Arrays.toString(atividadesEsportivas.toArray());
        return display;
    }
}
