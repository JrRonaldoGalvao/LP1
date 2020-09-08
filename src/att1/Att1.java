package att1;

import javax.swing.JOptionPane;

public class Att1 {

    public static void main(String[] args) {
        AlunoFatecSJC[] al = new AlunoFatecSJC[5];
        al[0] = new AlunoFatecSJC(JOptionPane.showInputDialog("Nome"),("412425634-3"),("131323"));
        al[1] = new AlunoFatecSJC(JOptionPane.showInputDialog("Nome"),("411412554-5"),("323444"));
        al[2] = new AlunoFatecSJC(JOptionPane.showInputDialog("Nome"),("521456652-2"),("425366"));
        al[3] = new AlunoFatecSJC(JOptionPane.showInputDialog("Nome"),("132234421-5"),("944882"));
        al[4] = new AlunoFatecSJC(JOptionPane.showInputDialog("Nome"),("231423342-0"),("943445"));
        for (int i=0; i<4; i++){
            System.out.println("Aluno: "+al[i].getNome()+", CPF: "+ al[i].getCpf()+" e matricula "+al[i].getMatricula());
        }
        
        Pessoa ps[] = new Pessoa[5];
        ps[0] = new Pessoa(JOptionPane.showInputDialog("Nome"),(67.6f), (1.67f));
        ps[1] = new Pessoa(JOptionPane.showInputDialog("Nome"),(78.9f), (1.87f));
        ps[2] = new Pessoa(JOptionPane.showInputDialog("Nome"),(70.6f), (1.65f));
        ps[3] = new Pessoa(JOptionPane.showInputDialog("Nome"),(92.4f), (1.91f));
        ps[4] = new Pessoa(JOptionPane.showInputDialog("Nome"),(87.8f), (1.86f));
        for (int i=0; i<4; i++){
            System.out.println("Nome: "+ps[i].getNome()+", peso: "+ ps[i].getPeso()+" e altura "+ps[i].getAltura());
        }
        
        Calçado c1[] = new Calçado[5];
        c1[0] = new Calçado(JOptionPane.showInputDialog((42f), ("Polimero"), ("Tenis")));
        c1[1] = new Calçado(JOptionPane.showInputDialog((40f), ("Couro"), ("Bota")));
        c1[0] = new Calçado(JOptionPane.showInputDialog((37f), ("Borracha"), ("Crocs")));
        c1[0] = new Calçado(JOptionPane.showInputDialog((38f), ("Borracha"), ("Chinelo")));
        c1[0] = new Calçado(JOptionPane.showInputDialog((42f), ("Couro"), ("Bota")));
        for (int i=0; i<4; i++){
            System.out.println("Tamanho: "+c1[i].getTamanho()+", material: "+ c1[i].getMaterial()+" e tipo "+c1[i].getTipo());
        }
        
        Lugar lg[] = new Lugar[5];
        lg[0] = new Lugar(JOptionPane.showInputDialog(("Rio de Janeiro"),("Cristo Redentor"),("Hotel")));
        lg[1] = new Lugar(JOptionPane.showInputDialog(("SJC"),("Parque da cidade"),("Pousada")));
        lg[2] = new Lugar(JOptionPane.showInputDialog(("Angra dos Reis"),("Usina"),("Hotel")));
        lg[3] = new Lugar(JOptionPane.showInputDialog(("New York"),("Central Park"),("Hotel")));
        lg[4] = new Lugar(JOptionPane.showInputDialog(("Sao Thome das Letras"),("Piramide"),("Pousada")));
        for (int i=0; i<4; i++){
            System.out.println("Cidade: "+lg[i].getLocal()+", ponto turistico: "+lg[i].getPonto_turistico()+" e hospedagem em "+lg[i].getHospedagem());
        }
                
        Profissional pr[] = new Profissional[5];
        pr[0] = new Profissional(JOptionPane.showInputDialog(("Medico"),("Medicina"),("Hospital")));
        pr[1] = new Profissional(JOptionPane.showInputDialog(("Corretor"),("Imoveis"),("Imobiliaria")));
        pr[2] = new Profissional(JOptionPane.showInputDialog(("Professor"),("Ensino"),("Escola")));
        pr[3] = new Profissional(JOptionPane.showInputDialog(("Chef"),("Culinaria"),("Restaurante")));
        pr[4] = new Profissional(JOptionPane.showInputDialog(("Programador"),("Informatica"),("Escritorio")));
        for (int i=0; i<4; i++){
            System.out.println("Profissão: "+pr[i].getProfissão()+", area de trabalho: "+ pr[i].getArea()+" e local de trabalho "+pr[i].getLocal_de_trabalho());
        }
        
        InstrumentoMusical im[] = new InstrumentoMusical[5];
        im[0] = new InstrumentoMusical(JOptionPane.showInputDialog(("Flauta"),("Sopro"),(0.400f)));
        im[1] = new InstrumentoMusical(JOptionPane.showInputDialog(("Violão"),("Corda"),(5.0f)));
        im[2] = new InstrumentoMusical(JOptionPane.showInputDialog(("Viola"),("Corda"),(0.700f)));
        im[3] = new InstrumentoMusical(JOptionPane.showInputDialog(("Chocalho"),("Percusao"),(1.2f)));
        im[4] = new InstrumentoMusical(JOptionPane.showInputDialog(("Arcodeon"),("tecla"),(9.2f)));
        for (int i=0; i<4; i++){
            System.out.println("Instrumento: "+im[i].getNome()+", tipo: "+ im[i].getTipo()+" e peso "+im[i].getPeso());
        }
    
    }
    
}
