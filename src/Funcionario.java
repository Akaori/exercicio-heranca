public abstract class Funcionario {
    protected String nome;
    protected Integer idade;
    protected Integer cadastro;
    protected Double salarioHora;
    protected Double horasTrabalhadas;


    public Funcionario(String nome, Integer idade, Integer cadastro, Double salarioHora, Double horasTrabalhadas) {
        this.nome = nome;
        this.idade = idade;
        this.cadastro = cadastro;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public abstract Double calcularSalario();

    public abstract void baterPonto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getCadastro() {
        return cadastro;
    }

    public void setCadastro(Integer cadastro) {
        this.cadastro = cadastro;
    }

    public Double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }


}
