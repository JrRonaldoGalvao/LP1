package att1;

public class Profissional {
    
    private String profissão;
    private String area;
    private String local_de_trabalho;

    public Profissional(String profissão, String area, String local_de_trabalho) {
        this.profissão = profissão;
        this.area = area;
        this.local_de_trabalho = local_de_trabalho;
    }
    
    public void gerenciar(){
        System.out.println("Gerenciar um projeto");
    }
    
    public void assistenciar(){
        System.out.println("Ajudar alguem");
    }
    
    public void liderar(){
        System.out.println("Liderar uma equipe");
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocal_de_trabalho() {
        return local_de_trabalho;
    }

    public void setLocal_de_trabalho(String local_de_trabalho) {
        this.local_de_trabalho = local_de_trabalho;
    }

}
