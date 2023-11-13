package br.com.projetofaroeste;

import java.util.List;
public class FaroesteMain {
    public static void associarCowboy(Cowboy cowboy, Cidade cidade, Cavalo cavalo) {
        if (cidade == null) {
            return;
        }
        if (cavalo == null) {
            return;
        }
        cowboy.setGangue(cidade.getNomeCidade());
        cowboy.setCavalo(cavalo.getNome());
        cavalo.setDonoCavalo(cowboy);
    }
    public static void associarOutlaw(Outlaw outlaw, Gangue gangue, Cavalo cavalo) {
        if (gangue == null) {
            return;
        }
        if (cavalo == null) {
            return;
        }

        outlaw.setGangue(gangue.getNomeGangue());
        outlaw.setCavalo(cavalo.getNome());
        cavalo.setDonoCavalo(outlaw);
    }
    public static void associarLawman(Lawman lawman, Cidade cidade, Cavalo cavalo) {
        if (cidade == null) {
            return;
        }
        if (cavalo == null) {
            return;
        }

        lawman.setGangue(cidade.getNomeCidade());
        lawman.setCavalo(cavalo.getNome());
        cavalo.setDonoCavalo(lawman);
    }
    public static void adicionarItemAoCowboy(Cowboy cowboy, String... itens) {
        for (String item : itens) {
            cowboy.adicionarItemAoInventario(item);
        }
    }
    private static void removerItemDoInventario(Cowboy cowboy, String item) {
        cowboy.removerItemDoInventario(item);
        System.out.println("Item Removido do inventário: " + item + "\n");
    }
    public static void adicionarItemAoCavalo(Cavalo cavalo, String... itens) {
        for (String item : itens) {
            cavalo.adicionarItemAoInventario(item);
        }
    }
    public static void removerItemDoCavalo(Cavalo cavalo, String item) {
        cavalo.removerItemDoInventario(item);
        System.out.println("Item Removido do alforje: " + item + "\n");
    }
    public static void exibirInfoCowboy(Cowboy cowboy) {
        System.out.println("_".repeat(150) + "\n");
        System.out.println("INFORMAÇÕES SOBRE O COWBOY " + cowboy.getNome().toUpperCase());
        System.out.println("Nome: " + cowboy.getNome() + ".");
        System.out.println("Idade: " + cowboy.getIdade());
        System.out.println("Saúde: " + cowboy.getSaude());
        System.out.println("Energia: " + cowboy.getEnergia());
        System.out.println("Cavalo: " + (cowboy.getCavalo().isEmpty() ? "Nenhum." : cowboy.getCavalo()));

        if (cowboy instanceof Lawman) {
            String cidade = ((Lawman) cowboy).getCidade();
            System.out.println("Cidade: " + (cidade.isEmpty() ? "Não possui uma cidade definida, viajante." : cidade));
        } else {
            String gangue = cowboy.getGangue();
            System.out.println("Gangue: " + (gangue.isEmpty() ? "Não faz parte de nenhuma gangue." : gangue));
        }

        List<String> itensDoInventario = cowboy.listarItensDoInventario();
        System.out.println("Itens no Inventário: " + (itensDoInventario.isEmpty() ? "Vazio." : String.join(", ", itensDoInventario)));
        System.out.println();
    }
    public static void exibirInfoCavalo(Cavalo cavalo) {
        System.out.println("_".repeat(150) + "\n");
        System.out.println("INFORMAÇÕES SOBRE O CAVALO " + cavalo.getNome().toUpperCase());
        System.out.println("Nome: " + cavalo.getNome() + ".");
        System.out.println("Raça: " + cavalo.getRaca() + ".");
        System.out.println("Pelagem: " + cavalo.getPelagem());
        System.out.println("Saúde: " + cavalo.getSaude());
        System.out.println("Energia: " + cavalo.getEnergia());
        System.out.println("Velocidade: " + cavalo.getVelocidade() + ".");
        System.out.println("Resistência: " + cavalo.getResistencia());
        System.out.println("Dono: " + (cavalo.getDonoCavalo() != null ? cavalo.getDonoCavalo().getNome() : "Nenhum"));
        System.out.println("Vínculo: " + cavalo.getVinculo());

        if (cavalo instanceof CavaloSelvagem cavaloSelvagem) {
            System.out.println("Agressividade: " + cavaloSelvagem.getAgressividade());
            System.out.println("Localização: " + cavaloSelvagem.getLocalizacao());
        }

        List<String> itensDoInventario = cavalo.listarItensDoCavalo();
        System.out.println("Itens no alforje: " + (itensDoInventario.isEmpty() ? "Vazio." : String.join(", ", itensDoInventario)));
        System.out.println();
    }
    public static void exibirInfoAnimal(Animal animal) {
        System.out.println("_".repeat(150) + "\n");
        System.out.println("INFORMAÇÕES SOBRE O " + animal.getEspecie().toUpperCase());
        System.out.println("Especie: " + animal.getEspecie());
        System.out.println("Categoria: " + animal.getCategoria());
        System.out.println("Agressividade: " + animal.getAgressividade());
        System.out.println("Velocidade: " + animal.getVelocidade() + ".");
        System.out.println("Resistência: " + animal.getResistencia());
        System.out.println("Localização: " + animal.getLocalizacao());
    }
    public static void main(String[] args) {
        Gangue vanDerLindeGang = new Gangue("Van der Linde", "Dutch Van der Linde", true);
        Gangue oDriscollsGang = new Gangue("O'Driscoll Boys", "Colm O'Driscoll", true);
        Cidade valentine = new Cidade("Valentine", "Curtis Malloy", false);
        Cidade blackwater = new Cidade("Blackwater", "Xerife Johnson", true);

        Cavalo cavalo1 = Cavalo.criarCavalo("Jorginho", "Tennessee Walker", "Equitação", 0.8, 0.9, "Mediana", "Alta", "Cinza", 0.3);
        Cavalo cavalo2 = Cavalo.criarCavalo("Juan", "Puro-sangue Árabe", "Elite", 0.5, 0.5, "Alta", "Baixa", "Preto", 0.5);
        Cavalo cavalo3 = Cavalo.criarCavalo("Alípio", "Missouri Fox-Trotter", "Multiuso",0.8, 0.9, "Alta", "Mediana", "Caramelo", 0.9);
        Cavalo cavalo4 = Cavalo.criarCavalo("Bala no Alvo", "Bretão", "Guerra",0.7, 0.9, "Baixa", "Alta", "Marrom", 0.0);
        CavaloSelvagem cavaloSelvagem1 = CavaloSelvagem.criarCavaloSelvagem("", "Puro-sangue Inglês", "Corida", 100, 80, "Rápida", "Alta", "Preto", 0, "Agressivo", "Floresta");

        Animal animal1 = Animal.criarAnimal("Lobo Cinzento", "Predador", "Alta", "Rápido", "Mediana", "Florestas, Montanhas");
        Animal animal2= Animal.criarAnimal("Urso Pardo", "Predador", "Alta", "Lento", "Muito alta", "Florestas");

        Cowboy cowboy1 = Cowboy.criarCowboy("Billy Midnight", 20, 0.9, 0.7, "", "");
        Outlaw outlaw1 = Outlaw.criarOutlaw("Arthur Morgan", 25, 0.6, 0.8, "", "");
        Outlaw outlaw2 = Outlaw.criarOutlaw("Colm O'Driscoll", 25, 0.6, 0.8, "", "");
        Lawman lawman1 = Lawman.criarLawman("Curtis Malloy", 25, 0.6, 0.8, "","");

        associarCowboy(cowboy1, valentine, cavalo1);
        exibirInfoCowboy(cowboy1);
        exibirInfoCavalo(cavalo1);

        associarOutlaw(outlaw1, vanDerLindeGang, cavalo2);
        adicionarItemAoCowboy(outlaw1, "Revólver", "Cigarro", "Dinamite.");
        adicionarItemAoCavalo(cavalo2, "Rifle", "Saco de dormir.");
        exibirInfoCowboy(outlaw1);
        vanDerLindeGang.adicionarMembro(outlaw1);
        outlaw1.roubar();
        removerItemDoInventario(outlaw1, "Dinamite");
        outlaw1.roubarBanco();
        outlaw1.atirar();
        outlaw1.duelar(cowboy1);

        exibirInfoAnimal(animal1);
        animal1.atacar(outlaw1);
        exibirInfoAnimal(animal2);
        animal2.atacar(outlaw1);

        exibirInfoCavalo(cavalo2);
        removerItemDoCavalo(cavalo2, "Rifle");
        cavalo2.serMontado();
        cavalo2.trotar();
        cavalo2.correr();
        cavalo2.serCuidado();
        exibirInfoCavalo(cavaloSelvagem1);
        cavaloSelvagem1.serDomado(outlaw1);

        adicionarItemAoCowboy(outlaw2, "Revólver", "Cigarro", "Mapa.");
        exibirInfoCowboy(outlaw2);
        cowboy1.duelar(outlaw2);

        associarLawman(lawman1, blackwater, cavalo3);
        adicionarItemAoCowboy(lawman1, "Revólver", "Carabina", "Algemas", "Distintivo", "Chapéu.");
        exibirInfoCowboy(lawman1);

        lawman1.prenderOutlaw(outlaw2);
        removerItemDoInventario(lawman1, "Algemas");
        lawman1.atirar();
        lawman1.duelar(outlaw1);
        exibirInfoCavalo(cavalo3);

        oDriscollsGang.imprimirInformacoes();
        oDriscollsGang.adicionarMembro(outlaw2);
        oDriscollsGang.removerMembro(outlaw2);
        oDriscollsGang.removerMembro(outlaw2);
        oDriscollsGang.adicionarMembro(outlaw2);
        oDriscollsGang.imprimirMembros();
        associarOutlaw(outlaw2, oDriscollsGang, cavalo4);
        exibirInfoCowboy(outlaw2);
        oDriscollsGang.roubarBanco();

        vanDerLindeGang.brigarEntreGangues(oDriscollsGang);

        valentine.imprimirInformacoes();
        valentine.adicionarLoja("Mercado Geral");
        valentine.adicionarLoja("Saloon");
        valentine.adicionarLoja("Ferreiro");
        valentine.adicionarLoja("Estábulo");
        valentine.adicionarLoja("Farmácia");
        valentine.removerLoja("Farmácia");
        valentine.imprimirLojas();

        valentine.brigarComGangue(oDriscollsGang);
        blackwater.brigarComGangue(vanDerLindeGang);
    }
}
