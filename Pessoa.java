//CLASSE MÃE PESSOA

public class Pessoa{ // inicio super classe Pessoa
    //Atributos publicos da super classe Pessoa
    public String nome; // declarando var do tipo string para o nome 
    public String email; // declarando var do tipo string para o email
    public String telefone; // declarando var do tipo string para o telefone, em string pois pode conter "-", "(" e ")", assim evitando possiveis erros
    public String endereco;// declarando var do tipo string para o endereco

    // cmetodo Construtor da classe pessoa
    public Pessoa(String nome, String email, String telefone, String endereco) { // inicio metodo pessoa
        // instanciando os atributos
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }// fim metodo Pessoa

    //inicio metodos getters 
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
    // fim metodos getters
    
    //inicio metodos setters
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
    //fim metodos setters
    
    public String listarDados(){ //inicio metodo para listar os dados
        //String para mostrar dados cadastrados
        String display_dados ="\n"+ "Nome: " + this.nome + ", E-mail: " + this.email + ", Telefone: " + this.telefone + ", Endereço: " + this.endereco+". ";
        return display_dados;
    } // fim metodo de listagem
} // fim super classe Pessoa
