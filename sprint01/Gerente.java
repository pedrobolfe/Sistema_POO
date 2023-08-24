import java.util.ArrayList;

public class Gerente {

    //atributos
    private ArrayList<Funcionario> funcionariosCadastrados;



    public ArrayList<Funcionario> cadastrarFuncionarios(String nome, String email,String endereco,String telefone,String cargo,double salario){
        
        this.funcionariosCadastrados = new ArrayList<Funcionario>();
        this.funcionariosCadastrados.add(new Funcionario(nome, email, endereco, telefone, cargo, salario));
        return this.funcionariosCadastrados;

    }
    
}
