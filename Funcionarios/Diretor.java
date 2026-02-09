class Diretor extends Funcionario implements Autenticavel {
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
}