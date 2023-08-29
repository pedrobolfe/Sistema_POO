import java.util.ArrayList;
public class Dependente extends Pessoa{

    public int idade;

    public Dependente(String nome,  String email, String endereco, String telefone, int idade){
        super(nome, email, telefone, endereco);
        this.idade = idade;
    }
    
    //getters
    public int getIdade() {
        return idade;
    }
   
    //setters
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
