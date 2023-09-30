public class Turmas {
    
    private String diaSemana;
    private String horarioInicio;
    private String horarioTermino;

    // Construtor
    public Turmas(String diaSemana, String horarioInicio, String horarioTermino) {
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    @Override
    public String toString() {
        return "Dia da Semana: " + diaSemana + ", Horário de Início: " + horarioInicio + ", Horário de Término: " + horarioTermino;
    }

}