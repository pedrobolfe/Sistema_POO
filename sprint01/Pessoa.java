import java.util.ArrayList;

public class Pessoa{

    //Atributos essenciais
    public String nome;
    public String email;
    public String telefone;
    public String endereco;

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

    public String listarInfo(){
        String display_dados = "nome: "+this.nome + "E-mail: "+this.email+"Telefone: "+this.telefone+"Endereço: "+this.endereco;
        return display_dados;
    }

    public void cadastrar(String nome, String endereco, String telefone){
        //ArrayList<String> = 
    }
}