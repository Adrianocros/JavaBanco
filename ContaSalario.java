package BancoPolimorfismo;
public class ContaSalario extends Conta{
    private int quantidadeDeSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadeDeSaques){
        super(numero, agencia, banco, saldo);    
        this.quantidadeDeSaques = quantidadeDeSaques;
    }

    @Override
    public String toString() {
        return "ContaSalario [quantidadeDeSaques=" + 
        quantidadeDeSaques + quantidadeDeSaques +"]";
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean sacar(double quantia){
        if (quantia > saldo){
            return false;
        }else{
            if(this.quantidadeDeSaques > 0){
                this.quantidadeDeSaques--;
                this.saldo -=quantia;
                return true;
            }else{
                System.out.println("Limite de saque exedido");
                return false;
            }
        }
    }  
}
