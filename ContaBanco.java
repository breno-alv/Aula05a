//Atributos
package aula05a;

public final class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos Personalizados
    public void estadoAtual(){
        System.out.println("_____________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);  
        }
        System.out.println("Conta Aberta com Sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada poque ainda tem saldo");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois possui Debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada com Sucesso!");
        }
        
    }
    
    public void deposita(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;                                         // alterando direto nos atributo
            this.setSaldo (v + this.getSaldo());                                    // trabalhando direto nos metodos especiais
                System.out.println("Deposito realizado na conta " + this.getDono());
        } else {
                System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente para saque");
            } 
        }else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v =12;
        } else if (this.getTipo() == "CP"){
            v =20;
        } if (this.getStatus()){
             this.setSaldo(this.getSaldo() - v);
             System.out.println("Mesalidade paga com sucesso por" + this.getDono());
        }else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }
    
    //Metodos Esapeciais
    
    public ContaBanco(){ // Metodo Construtor
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }
    
    
}
