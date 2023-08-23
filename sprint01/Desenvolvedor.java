public class Desenvolvedor extends Funcionario {
    private int horasTrabalhadas;
    private double taxaPorHora;

    public Desenvolvedor(String nome, double salarioBase, int horasTrabalhadas, double taxaPorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + (horasTrabalhadas * taxaPorHora);
    }
}

