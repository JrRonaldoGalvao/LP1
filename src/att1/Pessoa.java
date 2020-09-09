package att1;

public class Pessoa {
    private String nome;
    private float peso;
    private float altura;

    public Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public void nomear(){
        System.out.println("Nomear alguem");
    }
    
    public void pesar(){
        System.out.println("Se pesar na balança");
    }
    
    public void medir(){
        System.out.println("Se medir com o auxilio de algum instrumento proprio");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    } 
    
}
