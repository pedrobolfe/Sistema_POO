package sprint02;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private static Map<String, String> mapaUsuarioSenha = new HashMap<>();

    public static void main(String[] args) {
        // Cadastrar funcionários no dicionário
        cadastrarFuncionario("joao123", "senha123");
        cadastrarFuncionario("maria456", "senha456");

        // Autenticar um funcionário usando nome de usuário e senha
        String nomeUsuario = "joao123";
        String senha = "senha123";

        if (autenticarFuncionario(nomeUsuario, senha)) {
            // Exibir informações pessoais do funcionário autenticado
            System.out.println("Funcionário autenticado com sucesso.");
        } else {
            System.out.println("Falha na autenticação.");
        }
    }

    private static void cadastrarFuncionario(String nomeUsuario, String senha) {
        mapaUsuarioSenha.put(nomeUsuario, senha);
    }

    private static boolean autenticarFuncionario(String nomeUsuario, String senha) {
        // Verificar se o nome de usuário existe no dicionário
        if (mapaUsuarioSenha.containsKey(nomeUsuario)) {
            // Verificar se a senha corresponde à senha no dicionário
            if (mapaUsuarioSenha.get(nomeUsuario).equals(senha)) {
                return true; // Autenticação bem-sucedida
            }
        }
        return false; // Autenticação falhou
    }
}
