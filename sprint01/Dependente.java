public class Dependente extends Pessoa{ // inicio da classe Dependente herdando os atributos da Classe Pessoa
    // atributo da classe dependente
    public int idade; // declarando uma var do tipo inteiro que ira representar a idade do dependente

    // metodo contrutor da classe dependente
    public Dependente(String nome,  String email, String endereco, String telefone, int idade){ // inicio metodo construtor
        super(nome, email, telefone, endereco); // chamando o contrutor da superclasse
        this.idade = idade;
    } // fim metodo contrutor
    
    // metodo getter
    public int getIdade() {
        return idade;
    }
    // fim metodo getter
   
    //inicio metodo setter
    public void setIdade(int idade) {
        this.idade = idade;
    }
    // fim metodo setter
    
    @Override
    public String toString() {
        String display_info = "Nome: "+this.nome+", Idade: "+this.idade +" anos";
        return display_info;
    }// fim metodo toString()
} // fim classe Dependente
