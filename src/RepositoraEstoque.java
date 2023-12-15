public class RepositoraEstoque extends Funcionario {
    public RepositoraEstoque(String nome, Integer idade, Integer cadastro, Double salarioHora, Double horasTrabalhadas) {
        super(nome, idade, cadastro, salarioHora, horasTrabalhadas);
    }

    @Override
    public Double calcularSalario() {
        Double salarioFinal = this.salarioHora * this.horasTrabalhadas;
        System.out.printf("%s seu salário de Repositora de Estoque é: %.2f%n", this.nome, salarioFinal);
        return salarioFinal;
    }

    @Override
    public void baterPonto() { //Conferir retorno
        System.out.printf("A Repositora de Estoque %s bateu o ponto.%n", this.nome);
    }
    public void reporProduto(){
        System.out.printf("%s, você realizou uma reposição de um produto.%n", this.nome);
    }
}
