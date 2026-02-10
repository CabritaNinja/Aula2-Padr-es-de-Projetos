class Secretario extends Funcionario{
    public Secretario(String nome) {
        super(nome);
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário de Secretário para " + getNome());
    }
    
}