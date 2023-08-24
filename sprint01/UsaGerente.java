public class UsaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.cadastrarFuncionarios("Nelson", "Rua quinto dos inferno, 123", "45 98838-5213", "nelson@hotmail.com", "jovem aprendiz", 500);

        System.out.println("Funcionarios cadastrados com sucesso!");       
    }   
}
