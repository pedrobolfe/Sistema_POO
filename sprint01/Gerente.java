import java.util.ArrayList;

public class Gerente {

    //atributos
    private ArrayList<Funcionario> funcionariosCadastrados = new ArrayList<Funcionario>();
   



    public ArrayList<Funcionario> cadastrarFuncionarios(String nome, String email,String endereco,String telefone,String cargo,double salario){

        
        

        this.funcionariosCadastrados.add(new Funcionario(nome, email, endereco, telefone, cargo, salario));
        return this.funcionariosCadastrados;

    }
    
}
