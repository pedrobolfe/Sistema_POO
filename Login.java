package sprint02;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private static Map<String, String> mapaUsuarioSenha = new HashMap<>();

    public static void main(String[] args) {

        // Cadastrar funcionários no dicionário
        cadastrarFuncionario("pdro", "seila124");
        cadastrarFuncionario("zeuzeu", "sla1234");

        // Autenticar um funcionário usando nome de usuário e senha
        String user = "pdro124";
        String senha = "seila124";


        if (autenticarFuncionario(user, senha)) {
            System.out.println("Login feito com sucesso");
            // Exibir informações pessoais do funcionário autenticado
            
            //System.out.println(funcionarios.listarFuncionarios);
        } else {
            System.out.println("Erro no login");
        }
    }

    private static void cadastrarFuncionario(String nomeUsuario, String senha) { // coloca um funcionario no dicionario futuro bd
        mapaUsuarioSenha.put(nomeUsuario, senha);
    }

    // metodo para quando tiver o banco de dados, usar para autenticar um funcionario
    private static boolean autenticarFuncionario(String nomeUsuario, String senha) {
        // Verificar se o nome de usuário existe no bd
        if (mapaUsuarioSenha.containsKey(nomeUsuario)) {
            // Verificar se a senha corresponde à senha do banco de dados
            if (mapaUsuarioSenha.get(nomeUsuario).equals(senha)) {
                return true; // Autenticação bem-sucedida
            }
            return false;
        }
        return false; // Autenticação falhou
    }
}
