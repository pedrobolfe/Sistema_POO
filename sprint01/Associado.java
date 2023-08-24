import java.util.ArrayList;

public class Associado extends Pessoa {
    
    //metódos
    private ArrayList<String> dependentes;
    private ArrayList<String> atividadesEsportivas;
    //Contém status do pagemento e forma de pagamento
    private ArrayList<String> dadosPagemento;
    


    //construtor 
    public Associado(String nome, String email,String endereco,String telefone,ArrayList<String> dadosPagemento,ArrayList<String> dependentes,ArrayList<String> atividadesEsportivas){
        super(nome,email,telefone,endereco);
        this.dadosPagemento = dadosPagemento;
        this.dependentes = dependentes;
        this.atividadesEsportivas = atividadesEsportivas;
    }

    //getters  
    public ArrayList<String> getDadosPagemento() {
        return dadosPagemento;
    }
    public ArrayList<String> getAtividadesEsportivas() {
        return atividadesEsportivas;
    }
    public ArrayList<String> getDependentes() {
        return dependentes;
    }

    //setters
    public void setDadosPagemento(ArrayList<String> dadosPagemento) {
        this.dadosPagemento = dadosPagemento;
    }
    public void setAtividadesEsportivas(ArrayList<String> atividadesEsportivas) {
        this.atividadesEsportivas = atividadesEsportivas;
    }
    public void setDependentes(ArrayList<String> dependentes) {
        this.dependentes = dependentes;
    }
    

}
