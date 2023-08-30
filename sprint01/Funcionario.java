import java.util.ArrayList;

public class Funcionario extends Pessoa {
    //Atributos
    public String cargo;
    public double salario;

    //Armazenar Associados cadastrados
    private ArrayList<ArrayList<Associado>> associadosCadastrados =new ArrayList<ArrayList<Associado>>();
    //Armazenar funcionarios cadastrados
    private ArrayList<ArrayList<Funcionario>> funcionariossCadastrados =new ArrayList<ArrayList<Funcionario>>();

    //construtor
    public Funcionario(String nome, String email,String endereco,String telefone,String cargo,double salario){
        super(nome, email, telefone, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }

    //metódos
    public void cadastrarAssociado(String nome, String email,String endereco,String telefone,String dadosPagemento,ArrayList<Dependente> dependentes,ArrayList<String> atividadesEsportivas){
        
        //Lista para armazenar objeto
        ArrayList<Associado> dadosAssociado = new ArrayList<Associado>();        
        Associado novoAssociado = new Associado(nome, email, endereco, telefone, dadosPagemento, dependentes, atividadesEsportivas);
        //Salvando objeto em uma lista
        dadosAssociado.add(novoAssociado);
        this.associadosCadastrados.add(dadosAssociado);
    }

    public boolean autenticaGerente(){
        if (this.cargo == "GERENTE"){
            return true;
        }
        else {return false;}
    }

    public void cadastroFuncionario(String nome,String email, String endereco, String telefone, String cargo, double salario){
        if (this.autenticaGerente() == true){
            ArrayList<Funcionario> dadosFuncionario = new ArrayList<Funcionario>();
            Funcionario novoFuncionario = new Funcionario(nome, email, endereco, telefone, cargo, salario);  
            dadosFuncionario.add(novoFuncionario);
            this.funcionariossCadastrados.add(dadosFuncionario);    
        }
        else if (this.autenticaGerente() == false) { System.out.println("VOCÊ NÃO TEM ACESSO A ESSE METÓDO!");}
    }
    
    //Listagem de Associados cadastradados 
    public String listarAssociados(){
        return associadosCadastrados.toString();
    }
    //Listagem de Funcionários cadastrados 
    public String listarFuncionarios(){
        return funcionariossCadastrados.toString();
    }
    

    //getters
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }   
   
    //setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}