package BancoPolimorfismo;


public class ContaCorrente extends Conta implements Tributavel{
    private double chequeEspecial;
    private int viradaDeMes;
    
    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, int viradaDeMes ){
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.viradaDeMes = viradaDeMes;
    }

        
    @Override
    public double getValorImposto(){
        return this.getSaldo() * 0.10;
  
    }

    @Override
    public String toString() {
        return super.toString() + "ContaCorrente [chequeEspecial=" + chequeEspecial + ", viradaDeMes=" + viradaDeMes + "]";
    }
      
    public boolean sacar(double quantia){
        double disponivel = this.chequeEspecial + this.saldo;
          if(quantia > disponivel){
            System.out.println("Voce não tem limite disponivel");
            return false;
        }else{
            this.saldo -= quantia;
            return true;
        }
    } 
    public double getSaldo(int mes) {
        if(mes > viradaDeMes){
            return this.chequeEspecial + this.saldo * this.getValorImposto();
        }else{
            return this.chequeEspecial + this.saldo;
        }
        
    }


}
