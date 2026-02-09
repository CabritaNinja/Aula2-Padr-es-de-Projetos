class Funcionario extends Pessoa implements Departamento{
    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário de Funcionário" + getNome());
    }

    @Override
    public void login() {
        System.out.println("Funcionário " + getNome() + " realizou login");
    }
}