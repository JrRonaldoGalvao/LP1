package att1;

public class Calçado {
    
    private float tamanho;
    private String material;
    private String tipo;

    public Calçado(int tamanho, String material, String tipo) {
        this.tamanho = tamanho;
        this.material = material;
        this.tipo = tipo;
    }
    
    public void provar(){
        System.out.println("Ver se o calçado serve no pé");
    }
    
    public void personalizar(){
        System.out.println("Fazer modificações no calçado");
    }
    
    public void encomendar("Encomendar um calçado online"){
        System.out.println();
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
