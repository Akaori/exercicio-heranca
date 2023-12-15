
public class Main {
    public static void main(String[] args) {
        Vendedora juliana = new Vendedora("Juliana", 28, 101, 50.0, 200.0);
        VendedoraOnLine ana = new VendedoraOnLine("Ana", 25, 102, 50.0, 150.0);
        Funcionario pri = new Entregadora("Priscilla", 18,103,50.0,300.0);
        Funcionario igor = new RepositoraEstoque("Igor", 30, 104, 50.0, 100.0);

        juliana.baterPonto();
        juliana.calcularSalario(55.5);

        ana.baterPonto();
        ana.calcularSalario(50.0);
        ana.vendeuOnLine();

        pri.baterPonto();
        pri.calcularSalario();
        ((Entregadora) pri).concluirEntrega();

        igor.baterPonto();
        igor.calcularSalario();
        ((RepositoraEstoque) igor).reporProduto();
    }
}