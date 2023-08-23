import java.util.ArrayList;

public class Associado extends Pessoa {

    
    //Atributos Associado
    private String cargo;
    //Contém status do pagemento e forma de pagamento
    private ArrayList<String> dadosPagemento;
    private ArrayList<String> atividadesEsportivas;

    
    private ArrayList<String> associadosCadastrados;

    //getters
    public String getCargo() {
        return cargo;
    }
    public ArrayList<String> getDadosPagemento() {
        return dadosPagemento;
    }
    public ArrayList<String> getAtividadesEsportivas() {
        return atividadesEsportivas;
    }
    public ArrayList<String> getAssociadosCadastrados() {
        return associadosCadastrados;
    }

    //setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setDadosPagemento(ArrayList<String> dadosPagemento) {
        this.dadosPagemento = dadosPagemento;
    }
    public void setAtividadesEsportivas(ArrayList<String> atividadesEsportivas) {
        this.atividadesEsportivas = atividadesEsportivas;
    }
    public void setAssociadosCadastrados(ArrayList<String> associadosCadastrados) {
        this.associadosCadastrados = associadosCadastrados;
    }
    
    



    
}
