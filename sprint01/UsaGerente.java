public class UsaGerente { // inicio classe UsaGerente
    public static void main(String[] args) { // inicio metodo main
        // criando uma instância da classe Gerente.
        Gerente gerente = new Gerente();
        // cadastrar novo funcionario
        gerente.cadastrarFuncionarios("Nelson", "Rua quinto dos inferno, 123", "45 98838-5213", "nelson@hotmail.com", "jovem aprendiz", 500);

        System.out.println("Funcionarios cadastrados com sucesso!");
    } // fim metodo main
} // fim classe UsaGerente
