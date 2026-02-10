class Diretor extends Funcionario implements Autenticavel, Departamento, Fornecedor {
    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário de Diretor (Salário + Bônus) para " + getNome());
    }

    @Override
    public void login() {
        System.out.println("Diretor " + getNome() + " realizou login com acesso total.");
    }

    @Override
    public void loginFornecedor() {
        System.out.println("Diretor " + getNome() + " realizou login com acesso total.");
    }

    @Override
    public void loginDepartamento() {
        System.out.println("Diretor " + getNome() + " realizou login com acesso total.");
    }
}