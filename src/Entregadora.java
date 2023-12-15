public class Entregadora extends Funcionario{

    public Entregadora(String nome, Integer idade, Integer cadastro, Double salarioHora, Double horasTrabalhadas) {
        super(nome, idade, cadastro, salarioHora, horasTrabalhadas);
    }

    @Override
    public Double calcularSalario() {
        Double salarioFinal = this.salarioHora * this.horasTrabalhadas;
        System.out.printf("%s, seu salário de Entregadora é: %.2f%n", this.nome, salarioFinal);
        return salarioFinal;
    }

    @Override
    public void baterPonto() {
        System.out.printf("A entregadora %s bateu o ponto.%n", this.nome);
    }
    public final void concluirEntrega(){
        System.out.printf("Parabéns %s! A entrega foi concluída com sucesso!%n", this.nome);
    }
}
