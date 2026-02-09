class Gerente extends Pessoa implements Fornecedor{
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário de Gerente" + getNome());
    }

    @Override
    public void login() {
        System.out.println("Gerente " + getNome() + " realizou login");
    }
}