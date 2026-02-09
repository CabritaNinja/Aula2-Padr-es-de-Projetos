class Engenheiro extends Funcionario {
    public Engenheiro(String nome) {
        super(nome);
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário de Engenheiro para " + getNome());
    }

    @Override
    public void comissao() {
        System.out.println(getNome() + ": Recebe comissão de engenharia.");
    }
}