class Gerente extends Funcionario implements Autenticavel, Departamento{
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário de Gerente para " + getNome());
    }

    @Override
    public void login() {
        System.out.println("Gerente " + getNome() + " realizou login com acesso administrativo.");
    }

    @Override
    public void loginDepartamento() {
        System.out.println("Gerente " + getNome() + " realizou login com acesso administrativo.");
    }
}
