public class Vendedora extends Funcionario  {
    protected Double comissao;
    public Vendedora(String nome, Integer idade, Integer cadastro, Double salarioHora, Double horasTrabalhadas) {
        super(nome, idade, cadastro, salarioHora, horasTrabalhadas);
    }

    @Override
    public Double calcularSalario() {
        Double salarioFinal = this.salarioHora * this.horasTrabalhadas;
        System.out.printf("%s, seu salário de Vendedora é: %.2f%n", this.nome, salarioFinal);
        return salarioFinal;
    }

    public Double calcularSalario(Double comissao) {
        this.comissao = comissao;
        Double salarioFinal = (this.salarioHora * this.horasTrabalhadas) + this.comissao;
        System.out.printf("%s seu salário de Vendedora com comissão é: %.2f%n", this.nome, salarioFinal);
        return salarioFinal;
    }
    @Override
    public void baterPonto() {
        System.out.printf("A vendedora (loja física) %s bateu o ponto.%n", this.nome);
    }
}
