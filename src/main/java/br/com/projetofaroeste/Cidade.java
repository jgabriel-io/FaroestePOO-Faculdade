package br.com.projetofaroeste;

import java.util.ArrayList;
import java.util.List;

class Cidade {
    private final String nomeCidade;
    private final String xerife;
    private final boolean agressividade;
    private final List<String> lojas;
    public Cidade(String nomeCidade, String xerife, boolean agressividade) {
        this.nomeCidade = nomeCidade;
        this.xerife = xerife;
        this.agressividade = agressividade;
        this.lojas = new ArrayList<>();
    }
    public String getNomeCidade() {
        return nomeCidade;
    }
    public void adicionarLoja(String loja) {
        lojas.add(loja);
        System.out.println("A loja " + loja + " foi adicionada à cidade de " + nomeCidade + ".");
    }
    public void removerLoja(String loja) {
        if (lojas.remove(loja)) {
            System.out.println("A loja " + loja + " foi removida da cidade de " + nomeCidade + ".\n");
        } else {
            System.out.println("A loja " + loja + " não faz parte da cidade de " + nomeCidade + ".\n");
        }
    }
    public void imprimirInformacoes() {
        System.out.println("_".repeat(150) + "\n");
        System.out.println("INFORMAÇÕES SOBRE A CIDADE");
        System.out.println("Nome: " + nomeCidade + ".");
        System.out.println("Xerife: " + xerife + ".");
        System.out.println("Agressividade: " + (agressividade ? "Alta, atividades criminosas são frequentes e violentas." : "Baixa: Atividades criminosas são raras e geralmente não violentas."));
        imprimirLojas();
    }
    public void imprimirLojas() {
        System.out.print("Lojas: ");
        if (lojas.isEmpty()) {
            System.out.println("Nenhuma loja disponível.\n");
        } else {
            for (int i = 0; i < lojas.size(); i++) {
                System.out.print(lojas.get(i));

                // Adiciona vírgula se não for o último item
                if (i < lojas.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".\n");
        }
    }
    public void brigarComGangue(Gangue gangue) {
        System.out.println("Ao anoitecer, a luz dourada do sol lança sombras na rua empoeirada, onde a cidade de " + this.nomeCidade + " e a gangue " + gangue.getNomeGangue() + " se encontram para um confronto.");
        double chanceAtaque = Math.random();
        double chanceVitoria = Math.random();

        if (chanceAtaque <= 0.5) {
            System.out.println("Um membro da cidade de " + this.nomeCidade + " ataca primeiro contra a gangue " + gangue.getNomeGangue() + "!");
        } else {
            System.out.println("Um membro da gangue " + gangue.getNomeGangue() + " ataca primeiro contra a cidade de " + this.nomeCidade + "!");
        }
        if (chanceVitoria <= 0.5) {
            System.out.println(this.nomeCidade + " vence o confronto, causando baixas e forçando os sobreviventes de " + gangue.getNomeGangue() + " a fugirem.\n");
        } else {
            System.out.println(gangue.getNomeGangue() + " vence o confronto, causando baixas e forçando os sobreviventes de " + this.nomeCidade + " a fugirem.\n");
        }
    }
}
