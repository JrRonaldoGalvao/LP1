package att1;

public class InstrumentoMusical {
    private String nome;
    private String tipo;
    private float peso;

    public InstrumentoMusical(String nome, String tipo, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
