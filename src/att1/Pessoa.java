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
        System.out.println();
    }
    
    public void pesar(){
        System.out.println();
    }
    
    public void medir(){
        System.out.println();
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
