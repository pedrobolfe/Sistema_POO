public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente1 gerente = new Gerente1("Ana", 5000, 1000, "TI");
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 3000, 160, 20);

        System.out.println("Salário total do Gerente: " + gerente.calcularSalarioTotal());
        System.out.println("Salário total do Desenvolvedor: " + desenvolvedor.calcularSalarioTotal());
    }
}
