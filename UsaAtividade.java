import java.util.ArrayList;

public class UsaAtividade {
    public static void main(String[] args){
        ArrayList<String> empregosAntigos = new ArrayList<String>();
        ArrayList<String> feedbacksFuncionario = new ArrayList<String>();

        empregosAntigos.add("TELEMARKETING");
        empregosAntigos.add("RECEPEÇÃO");

        feedbacksFuncionario.add("EXPERIENTE"  );
        feedbacksFuncionario.add("MATURIDADE");
        
        Funcionario funcionario1 = new Funcionario("Gedervaldo Cunha Silveira", "gedervaldocunha45@gmail.com", "Rua Inacio, 791", "(45) 988567845", "Secretário", 1200.65, empregosAntigos, feedbacksFuncionario);
        Funcionario funcionario2 = new Funcionario("Adelinha de Carvalho Esperança", "linacarvalho7@gmail.com", "Rua Tupiacu, 1246", "45 98889-7416", "GERENTE", 2648.49, empregosAntigos, feedbacksFuncionario);

        //Dados da atividade
        String nomeAtividade = "Natação";
        String descricao = "Aprenda a nadar";
        String faixaEtaria = "Crianças e Adultos";
        String niveisHabilidade = "Iniciante";

        //Lista de turmas
        ArrayList<Turmas> turmas = new ArrayList<>();
        Turmas turma1 = new Turmas("Turma A", "Segunda-feira", "14:00 - 15:00");
        Turmas turma2 = new Turmas("Turma B", "Terça-feira", "16:00 - 17:00");
        turmas.add(turma1);
        turmas.add(turma2);
        funcionario1.cadastrarAtividade(nomeAtividade,descricao,faixaEtaria,niveisHabilidade,turmas);
        funcionario2.cadastrarAtividade(nomeAtividade, descricao, faixaEtaria, niveisHabilidade, turmas);

        String dados = funcionario1.listarAtividades();
        System.out.println(dados);

        



    }
   


    
}
