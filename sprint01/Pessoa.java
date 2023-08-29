import java.util.ArrayList;

public class Pessoa{

    //Atributos essenciais
    public String nome;
    public String email;
    public String telefone;
    public String endereco;
    private ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();

    //Construtor
    public Pessoa(String nome, String email, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //getters 
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String listarDados(){
        //String para mostrar dados cadastrados
        String display_dados = "\n"+"Nome: "+ this.nome +"\n"+ "E-mail: " + this.email +"\n"+ "Telefone: " + this.telefone+"\n" + "Endereço: " + this.endereco +"\n";
        //retorna String
        return display_dados;
    }

    public void cadastrarDados(Pessoa pessoa){
        pessoasCadastradas.add(pessoa);
    }
}
