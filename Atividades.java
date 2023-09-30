import java.util.ArrayList;
import java.util.Arrays;

public class Atividades {
    private String nome;
    private String descricao;
    private String faixaEtaria;
    private String niveisHabilidade;
    private ArrayList<Turmas> turmas;

    //construto
    public Atividades(String nome, String descricao, String faixaEtaria, String niveisHabilidade,ArrayList<Turmas> turmas) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
        this.turmas = turmas;
    }

    @Override
    public String toString(){
        // invocando o método da superclasse
        String display = "Nome: "+this.nome+", Descricao: "+this.descricao+", Faixa etaria: "+this.faixaEtaria + ", Niveis Habilidade "+this.niveisHabilidade + ", Turmas: "+this.turmas;
        return display + "\n";
    }

}
