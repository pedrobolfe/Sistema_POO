import java.util.ArrayList;

class Gerente { // inicio classe gerente
    // criando um array vazio para colocar as infos do novo funcionario
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    // Método para cadastrar um novo funcionário
    public void cadastrarFuncionarios(String nome, String endereco, String telefone, String email, String cargo, double salario) { // inicio metodo de cadastro de funcionario
        // criando uma nova instancia do funcionario
        Funcionario novoFuncionario = new Funcionario(nome, endereco, telefone, email, cargo, salario);
        funcionarios.add(novoFuncionario);
    } // fim metodo de cadastro de funcionario
} // fim classe gerente
