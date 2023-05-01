public class ContaBancaria {
    
    private String titular;
    public int numeroConta;
    private double saldo;
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar( double valor ){
        if( getSaldo() > valor){
            saldo -= valor;
            System.out.println("Seu saldo atual é de: " + getSaldo());
        }else{
            System.out.println("O saldo é maior que o valor do saque informado.");
            System.out.println("Seu saldo atual é de: " + getSaldo());
        }
    }
    public void transferir( String conta, double valor ){
        if (getSaldo() > valor) {
            saldo -= valor;
            System.out.printf("O valor de %d foi tranferido com sucesso para conta %s !", valor, conta);
            System.out.println("Seu Saldo atual é de: " + getSaldo());
        }
        else{
            System.out.println("Saldo Insuficiente");
            System.out.println("Seu Saldo atual é: " + getSaldo());
        }
    }

}