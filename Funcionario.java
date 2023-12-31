import java.util.ArrayList;
import java.util.Arrays;

public class Funcionario extends Pessoa { // inicio classe Funcionario herdando os atributos da classe Pessoa
    //Atributos publicos da classe Funcionario
    public String cargo; // declarando uma var do tipo string para o cargo 
    public double salario; // declarando uma var do tipo string para o salario
    public ArrayList<String> empregosAnteriores; //empregos anteriores do funcionario
    public ArrayList<String> feedbackFuncionario ; //treinamentos e feedbacks recebidos pelos funcionarios   

    //Armazenar Associados cadastrados
    private ArrayList<ArrayList<Associado>> associadosCadastrados =new ArrayList<ArrayList<Associado>>();
    //Armazenar funcionarios cadastrados
    private ArrayList<ArrayList<Funcionario>> funcionariossCadastrados =new ArrayList<ArrayList<Funcionario>>();
    //Armazenar atividades cadastradas
    private ArrayList<ArrayList<Turmas>> turmasCadastradas = new ArrayList<ArrayList<Turmas>>();
    //Armanezar turmas cadastradas
    private ArrayList<ArrayList<Atividade>> atividadesCadastradas = new ArrayList<ArrayList<Atividade>>();

    public String listarAtividades(){
        return atividadesCadastradas.toString();
    }


    // metodo construtor
    public Funcionario(String nome,String email, String endereco, String telefone, String cargo, double salario,ArrayList<String> empregosAnteriores,ArrayList<String> feedbackFuncionario){
        super(nome, email, telefone, endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.empregosAnteriores = empregosAnteriores;
        this.feedbackFuncionario = feedbackFuncionario;
    } // fim metodo construtor

    //Listagem de Associados cadastradados 
    public String listarAssociados(){
        return associadosCadastrados.toString();
    }

    //metódos
    public void cadastrarAssociado(String nome, String email, String endereco ,String telefone, String dadosPagemento, ArrayList<Dependente> dependentes, ArrayList<String> atividadesEsportivas){
        ArrayList<Associado> dadosAssociado = new ArrayList<Associado>();  //Array para armazenar objeto      
        Associado novoAssociado = new Associado(nome, email, endereco, telefone, dadosPagemento, dependentes, atividadesEsportivas);
        //Salvando objeto em uma lista
        dadosAssociado.add(novoAssociado);
        this.associadosCadastrados.add(dadosAssociado);
    }

    public void cadastrarAtividade(String nome, String descricao, String faixaEtaria, String niveisHabilidade,ArrayList<Turmas> turmas,String horario,String instrutor ){

        if (this.autenticaGerente() == true){
            ArrayList<Atividade> dadosAtividade = new ArrayList<Atividade>();  //Array para armazenar objeto      
            Atividade novaAtividade = new Atividade(nome, descricao,faixaEtaria,niveisHabilidade,turmas,instrutor,horario);
            //Salvando objeto em uma lista
            dadosAtividade.add(novaAtividade);
            this.atividadesCadastradas.add(dadosAtividade);
        }
        
    }
    // metodo booleano para conferir se gerente ou ñ  
    public boolean autenticaGerente(){ // inicio metodo autenticaGerente
        if (this.cargo.equals("GERENTE")){ 
            // se o atributo cargo for igual a gerente retornara true para validação do cadastro
            return true; // retorna true
        } else if (!this.cargo.equals("GERENTE")) {
            System.out.println("BEM VINDO FUNCIONARIO. AUTENTICAÇAO SUCESSIDIDA");
            return false;
        } // retorna falso
        System.out.println("AUTENTICAÇÃO COM PROBLEMA");
        return false;
        
    } // fim metodo autenticaGerente

    // inicio metodo cadastra Funcionario
    public void cadastroFuncionario(String nome,String email, String endereco, String telefone, String cargo, double salario,ArrayList<String> empregosAnteriores,ArrayList<String> feedbackFuncionario){ 
        if (this.autenticaGerente() == true){ // verifica se o metodo autenticaGerente é true, para validar o cadastro
            ArrayList<Funcionario> dadosFuncionario = new ArrayList<Funcionario>();
            Funcionario novoFuncionario = new Funcionario(nome, email, endereco, telefone, cargo, salario,empregosAnteriores,feedbackFuncionario);  
            dadosFuncionario.add(novoFuncionario);
            this.funcionariossCadastrados.add(dadosFuncionario);    
        } else if (this.autenticaGerente() == false) { System.out.println("VOCÊ NÃO TEM ACESSO A ESSE METÓDO!");} // caso o metodo autenticaGerente retorne falso, informa uma mensagem de erro
    } // fim metodo de castro de fundionario

    //mostrar informações dos funcionarios 
    public String resumoFuncionarios(){
        if (this.autenticaGerente() == true){
            String dadosResumo = "RESUMO DO FUNCIONÁRIO: "+Arrays.toString(this.empregosAnteriores.toArray())+ "," + Arrays.toString(this.feedbackFuncionario.toArray());
            return dadosResumo;

        }else if (this.autenticaGerente() == false){
            String erro = "AUTENTICAÇÃO FALHADA"; 
            return erro;
        }
        String EMP = "vaiza";
        return EMP;
        
    }
    
   
    //Listagem de Funcionários cadastrados 
    public String listarFuncionarios(){
        return funcionariossCadastrados.toString();
    }
  

    //inicio metodos getters
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }   
    // fim metodos getters
    
} // fim classe Funcionarioo
