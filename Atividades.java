import java.util.ArrayList;

public class Atividades {
    private String nome;
    private String descricao;
    private String faixaEtaria;
    private String niveisHabilidade;

    //Informações da turma
    private String diaSemana;
    private String horarioInicio;
    private String horarioTermino;
    private ArrayList<String> turmas = new ArrayList<>(); // Lista de turmas disponíveis

    // Construtor
    public Atividade(String nome, String descricao, String faixaEtaria, String niveisHabilidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
        this.turmas = new ArrayList<>();
    }

    // Getters e Setters
    // ...
}
