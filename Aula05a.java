package aula05a;

public class Aula05a {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Breno");
        p1.abrirConta("CP");
        p1.estadoAtual();
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Yuka");
        p2.abrirConta("CC");
        p2.estadoAtual();
        
        p1.deposita(100);
        p2.deposita(200);
        
    }
    
}
