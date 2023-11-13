package br.com.projetofaroeste;

public class CavaloSelvagem extends Cavalo {
    private String agressividade;
    private final String localizacao;
    public CavaloSelvagem(String nome, String raca, String categoria, double saude, double energia, String velocidade, String resistencia, String pelagem, double vinculo, String agressividade, String localizacao) {
        super(nome, raca, categoria, saude, energia, velocidade, resistencia, pelagem, vinculo);
        this.agressividade = agressividade;
        this.localizacao = localizacao;
    }
    public String getAgressividade() {
        return agressividade;
    }
    public void setAgressividade(String agressividade) {
        this.agressividade = agressividade;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void serDomado(Cowboy cowboy) {
        System.out.println(cowboy.getNome() + " está tentando domar o " + getRaca() + " selvagem.");
        double chanceDomar = Math.random();

        if (chanceDomar <= 0.5) {
            System.out.println(cowboy.getNome() + " domou com sucesso o " + getRaca() + " selvagem!\n");
            setAgressividade("Calmo"); // Define agressividade como calmo após ser domado com sucesso
        } else {
            System.out.println("A tentativa de domar falhou!\n");
        }
    }
    @Override
    public String getNome() {
        return super.getRaca() + " Selvagem";
    }
    @Override
    public Cowboy getDonoCavalo() {
        return null;
    }
    public static CavaloSelvagem criarCavaloSelvagem(String nome, String raca, String categoria, double saude, double energia, String velocidade, String resistencia, String pelagem, double vinculo, String agressividade, String localizacao) {
        return new CavaloSelvagem(nome, raca, categoria, saude, energia, velocidade, resistencia, pelagem, vinculo, agressividade, localizacao);
    }
}
