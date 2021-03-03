package BancoPolimorfismo;
public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;

    public double getSaldo(){
        return this.saldo;
    };

    public Conta(int numero, int agencia, String banco, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + 
        agencia + ", banco=" + 
        banco + ", numero=" + 
        numero + ", saldo=" + 
        saldo + "]";
    }

    public boolean sacar(double quantia){
        return false;
    }

    public void depositar(double quantia) {this.saldo += quantia;}  
    
}
