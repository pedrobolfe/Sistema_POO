import java.util.ArrayList;

public class Funcionario extends Pessoa {
   
    
    //Atributos
    public String cargo;
    public double salario;


    //Armazenar Associados cadastrados
    private ArrayList<Associado> associadosCadastrados =new ArrayList<Associado>();

    //construtor
    public Funcionario(String nome, String email,String endereco,String telefone,String cargo,double salario){
        super(nome, email, telefone, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }


    //metódos
    public ArrayList<Associado> cadastrarAssociado(String nome, String email,String endereco,String telefone,ArrayList<String> dadosPagemento,ArrayList<String> dependentes){
    
    
        Associado novoAssociado = new Associado(nome, email, endereco, telefone, dadosPagemento, dependentes, dependentes);
        this.associadosCadastrados.add(novoAssociado);
        
        
        
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
    public String getAssociadosCadastrados() {
        return associadosCadastrados.toString();
    }
    
    //setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    
}
