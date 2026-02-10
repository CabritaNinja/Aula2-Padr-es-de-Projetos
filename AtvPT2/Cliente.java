class Cliente extends Pessoa implements Autenticavel {

    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public void login() {
        System.out.println("Cliente " + getNome() + " realizou login no portal do cliente.");
    }
}