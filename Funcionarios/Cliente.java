class Cliente implements Autenticavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void login() {
        System.out.println("Cliente " + this.nome + " realizou login no portal do cliente.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}