package br.com.projetofaroeste;
class Outlaw extends Cowboy {
    public Outlaw(String nome, int idade, double saude, double energia, String cavalo, String gangue) {
        super(nome, idade, saude, energia, cavalo, gangue);
    }
    public void roubar() {
        System.out.println();
        double chanceSucesso = Math.random();
        double chanceAcao = Math.random();

        if (chanceAcao <= 0.3) {
            System.out.println(getNome() + " está tentando roubar uma casa!");
        } else if (chanceAcao <= 0.6) {
            System.out.println(getNome() + " está tentando roubar uma carruagem!");
        } else {
            System.out.println(getNome() + " está tentando roubar um trem!");
        }

        if (chanceSucesso <= 0.5) {
            System.out.println("O assalto foi realizado com sucesso, resultando em uma considerável soma de dinheiro. - O fora da lei sai com um saco cheio de dinheiro e itens valiosos.\n");
        } else {
            System.out.println("O assalto foi malsucedido, conseguindo apenas roubar alguns pertences das pessoas presentes no momento. - O fora da lei sai com alguns trocados e itens valiosos.\n");
        }
    }
    public void roubarBanco() {
        System.out.println(getNome() + " está planejando roubar um banco!");
        double chanceSucesso = Math.random();

        if (chanceSucesso <= 0.2) {
            System.out.println("Com muita sorte, o assalto foi executado com êxito, resultando em uma significativa quantidade de dinheiro. - O fora da lei sai com um saco cheio de dinheiro e itens valiosos.\n");
        } else {
            System.out.println("O assalto foi malsucedido. Parece que " + getNome() + " deveria ter trago alguem para vigiar a entrada. - O fora da lei sai de mãos vazias.\n");
        }
    }
    public static Outlaw criarOutlaw(String nome, int idade, double saude, double energia, String cavalo, String gangue) {
        return new Outlaw(nome, idade, saude, energia, cavalo, gangue);
    }
}
