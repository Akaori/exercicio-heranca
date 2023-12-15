public final class VendedoraOnLine extends Vendedora {
    public VendedoraOnLine(String nome, Integer idade, Integer cadastro, Double salarioHora, Double horasTrabalhadas) {
        super(nome, idade, cadastro, salarioHora, horasTrabalhadas);
    }

    public void vendeuOnLine(){
        System.out.printf("Muito bom %s! Você acabou de realizar uma venda online.%n", this.nome);
    }
    @Override
    public void baterPonto() {
        System.out.printf("A vendedora online %s bateu o ponto.%n", this.nome);
    }
}
