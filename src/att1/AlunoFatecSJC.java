package att1;

public class AlunoFatecSJC {
    private String nome;
    private String cpf;
    private String matricula;

    public AlunoFatecSJC(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    
    public void nomear(){
        System.out.println("Nomear a ficha do aluno");
    }
    
    public void cadastrar("Fazer o cadastro do aluno"){
        System.out.println();
    }
    
    public void matricular(){
        System.out.println("Matricular o aluno");
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
