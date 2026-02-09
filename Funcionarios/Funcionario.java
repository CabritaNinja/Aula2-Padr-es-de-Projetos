abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    public abstract void calcSalario();

    public void comissao() {
        System.out.println(this.nome + ": Não possui comissão definida.");
    }

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
