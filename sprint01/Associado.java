import java.util.ArrayList;
import java.util.Arrays;

public class Associado extends Pessoa { // inicio classe associado herdando os atributos da classe base Pessoa
    
    //atributos da classe Associado
    private ArrayList<String> atividadesEsportivas; // inicializando um array privado para as atividades esportivas
    private String dadosPagemento; // inicializando uma string privada para os dados de pagamentos
    private ArrayList<Dependente> dependentes; // inicializando uma array privado para os dependentes
    
    // construtor 
    public Associado(String nome, String email,String endereco,String telefone,String dadosPagemento,ArrayList<Dependente> dependentes,ArrayList<String> atividadesEsportivas){ // inico metodo construtor Associado
        super(nome,email,telefone,endereco); // chama o construtor da super claasse
        this.dadosPagemento = dadosPagemento; // referencia uma instância dos dados de pagamento 
        this.dependentes = dependentes; // referencia uma instância dos depententes
        this.atividadesEsportivas = atividadesEsportivas; // referencia uma instância das atividades de pagamento
    } // fim metodo construtor ASsociado

    //inicio metodos getters 
    public String getDadosPagemento() {
        return dadosPagemento;
    }
    public ArrayList<String> getAtividadesEsportivas() {
        return atividadesEsportivas;
    }
    // fim metodos getters

    // inicio metodos setters
    public void setDadosPagemento(String dadosPagemento) {
        this.dadosPagemento = dadosPagemento;
    }
    public void setAtividadesEsportivas(ArrayList<String> atividadesEsportivas) {
        this.atividadesEsportivas = atividadesEsportivas;
    }
    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    // fime metodos setters

    @Override
    public String toString(){
        // invocando o método da superclasse
        String display = super.listarDados() + "Dados Pagamento: "  + this.dadosPagemento + "\nDependentes: " + this.dependentes.toString() + "\nAtividades esportivas: " + Arrays.toString(atividadesEsportivas.toArray());
        return display;
    }
} // fim classe associado
