class Secretario extends Funcionario implements Departamento{
    public Secretario(String nome) {
        super(nome);
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário de Secretário para " + getNome());
    }

    @Override
    public void loginDepartamento() {
        System.out.println("Secretario " + getNome() + " realizou login com acesso administrativo.");
    }
    
}