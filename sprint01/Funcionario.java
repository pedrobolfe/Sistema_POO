import java.util.ArrayList;

public class Funcionario extends Pessoa { // inicio classe Funcionario herdando os atributos da classe Pessoa
    //Atributos publicos da classe Funcionario
    public String cargo; // declarando uma var do tipo string para o cargo 
    public double salario; // declarando uma var do tipo string para o salario

    //Armazenar Associados cadastrados
    private ArrayList<ArrayList<Associado>> associadosCadastrados =new ArrayList<ArrayList<Associado>>();
    //Armazenar funcionarios cadastrados
    private ArrayList<ArrayList<Funcionario>> funcionariossCadastrados =new ArrayList<ArrayList<Funcionario>>();

    // metodo construtor
    public Funcionario(String nome, String email,String endereco,String telefone,String cargo,double salario){
        super(nome, email, telefone, endereco);
        this.cargo = cargo;
        this.salario = salario;
    } // fim metodo cosntrutor

    //metódos
    public void cadastrarAssociado(String nome, String email,String endereco,String telefone,String dadosPagemento,ArrayList<Dependente> dependentes,ArrayList<String> atividadesEsportivas){
        ArrayList<Associado> dadosAssociado = new ArrayList<Associado>();  //Array para armazenar objeto      
        Associado novoAssociado = new Associado(nome, email, endereco, telefone, dadosPagemento, dependentes, atividadesEsportivas);
        //Salvando objeto em uma lista
        dadosAssociado.add(novoAssociado);
        this.associadosCadastrados.add(dadosAssociado);
    }
    // metodo booleano para conferir se gerente ou ñ  
    public boolean autenticaGerente(){ // inicio metodo autenticaGerente
        if (this.cargo == "GERENTE"){ // se o atributo cargo for igual a gerente retornara true para validação do cadastro
            return true; // retorna true
        } else {return false;} // retorna falso
    } // fim metodo autenticaGerente

    public void cadastroFuncionario(String nome,String email, String endereco, String telefone, String cargo, double salario){ // inicio metodo cadastra Funcionario
        if (this.autenticaGerente() == true){ // verifica se o metodo autenticaGerente é true, para validar o cadastro
            ArrayList<Funcionario> dadosFuncionario = new ArrayList<Funcionario>();
            Funcionario novoFuncionario = new Funcionario(nome, email, endereco, telefone, cargo, salario);  
            dadosFuncionario.add(novoFuncionario);
            this.funcionariossCadastrados.add(dadosFuncionario);    
        } else if (this.autenticaGerente() == false) { System.out.println("VOCÊ NÃO TEM ACESSO A ESSE METÓDO!");} // caso o metodo autenticaGerente retorne falso, informa uma mensagem de erro
    } // fim metodo de castro de fundionario
    
    //Listagem de Associados cadastradados 
    public String listarAssociados(){
        return associadosCadastrados.toString();
    }
    //Listagem de Funcionários cadastrados 
    public String listarFuncionarios(){
        return funcionariossCadastrados.toString();
    }

    //inicio metodos getters
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }   
    // fim metodos getters
    
    //inicio metodos setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // fim metodos setters 
} // fim classe Funcionarioo
