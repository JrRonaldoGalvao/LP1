package att1;

public class Lugar {
    private String local;
    private String ponto_turistico;
    private String hospedagem;

    public Lugar(String local, String ponto_turistico, String hospedagem) {
        this.local = local;
        this.ponto_turistico = ponto_turistico;
        this.hospedagem = hospedagem;
    }
    
    public void viajar(){
        System.out.println("Viajar para algum lugar");
    }
    
    public void visitar(){
        System.out.println("Visitar algum ponto turistico");
    }
    
    public void repousar(){
        System.out.println("Fazer check-in na hospedagem");
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPonto_turistico() {
        return ponto_turistico;
    }

    public void setPonto_turistico(String ponto_turistico) {
        this.ponto_turistico = ponto_turistico;
    }

    public String getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(String hospedagem) {
        this.hospedagem = hospedagem;
    }
    
}
