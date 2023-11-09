import java.util.ArrayList;


public class Atividade {
    private String nome;
    private String descricao;
    private String faixaEtaria;
    private String instrutor;
    private String horario;
    private String niveisHabilidade;
    private ArrayList<Turmas> turmas;
    
    //construto
    public Atividade(String nome, String descricao, String faixaEtaria, String niveisHabilidade,ArrayList<Turmas> turmas, String instrutor,String horario) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
        this.turmas = turmas;
        this.instrutor = instrutor;
        this.horario = horario;
    }

    @Override
    public String toString(){
        // invocando o método da superclasse
        String display = "Nome: "+this.nome+", Descricao: "+this.descricao+", Faixa etaria: "+this.faixaEtaria + ", Niveis Habilidade "+this.niveisHabilidade + ", Turmas: "+this.turmas;
        return display + "\n";
    }

}
