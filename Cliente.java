package BancoPolimorfismo;

public class Cliente implements Autenticador {
    private String nome;
    private String senha;
    private boolean status;
    private int compras;

    public Cliente(String nome, String senha, boolean status, int compras) {
        this.nome = nome;
        this.senha = senha;
        this.status = status;
        this.compras = compras;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCompras() {
        return compras;
    }
  

  
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", senha=" + senha + ", status=" + status + "]";
    }

    @Override
    public boolean autentica(String senha) {
        // TODO Auto-generated method stub
        if(this.senha != senha){
            System.out.println(this.nome + " - Não foi possivel autenticar");
            return false;
        }else{
            System.out.println(this.nome  + " - Autenticado");
            return true;
        }

    }

    
    
    
    
}


