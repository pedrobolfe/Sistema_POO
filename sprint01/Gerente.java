import java.util.ArrayList;

class Gerente {
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    // Método para cadastrar um novo funcionário
    public void cadastrarFuncionarios(String nome, String endereco, String telefone, String email, String cargo, double salario) {
        Funcionario novoFuncionario = new Funcionario(nome, endereco, telefone, email, cargo, salario);
        funcionarios.add(novoFuncionario);
    }
}
