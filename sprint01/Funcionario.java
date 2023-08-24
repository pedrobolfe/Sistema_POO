import java.util.ArrayList;

public class Funcionario extends Pessoa {
   
    
    //Atributos
    public String cargo;
    public double salario;

    //Armazena funcionarios cadastrados
    //private ArrayList<Funcionario> funcionariosCadastrados;

    //Armazenar Associados cadastrados
    private ArrayList<Associado> associadosCadastrados;

    //construtor
    public Funcionario(String nome, String email,String endereco,String telefone,String cargo,double salario){
        super(nome, email, telefone, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }


    //metódos
    public ArrayList<Associado> cadastrarAssociado(String nome, String email,String endereco,String telefone,ArrayList<String> dadosPagemento,ArrayList<String> dependentes){
        //Instanciando a ArrayList de classes 
        this.associadosCadastrados = new ArrayList<Associado>();
        this.associadosCadastrados.add(new Associado(nome, email, endereco, telefone, dadosPagemento, dependentes, dependentes));
        
        return this.associadosCadastrados;
    }

    //public listarAssociados(){}



    //getters
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public ArrayList<Associado> getAssociadosCadastrados() {
        return associadosCadastrados;
    }
    
    //setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
