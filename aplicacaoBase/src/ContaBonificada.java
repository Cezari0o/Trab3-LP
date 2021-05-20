public class ContaBonificada extends Conta {
    
    private double bonificacao; // Contem a porcentagem de bonificacao
    private double bonus;       // Contem o bonus

    public ContaBonificada(String numero, double saldo, double bonificacao, Cliente cliente) {
        super(numero, saldo, cliente);
        this.bonificacao = bonificacao;
        this.bonus = 0;
    }

    public ContaBonificada(String numero, Cliente cliente) {
        super(numero, cliente);
        this.bonificacao = 0.01; // Assim como mostrado em aula, a bonificacao padrao eh de 1 por cento.
        this.bonus = 0;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void creditar(double credito) {
        // Sobrescrevendo o metodo para atender o comportamento da conta
        super.creditar(credito);
        bonus += credito * bonificacao;
    }

    public void renderBonus() {
        double saldoTotal = this.getSaldo();
        this.setSaldo(saldoTotal + bonus);
        bonus = 0;
    }
}
