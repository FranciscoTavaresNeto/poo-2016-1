package com.gildedrose;

public class Main {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] itens = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Brie Envelhecido", 2, 0), //
                new Item("Elixir de Mangusto", 5, 7), //
                new Item("Sulfuras, Mão de Ragnaros", 0, 80), //
                new Item("Sulfuras, Mão de Ragnaros", -1, 80),
                new Item("Entradas para o Backstage do TAFKAL80ETC concert", 15, 20),
                new Item("Entradas para o Backstage do TAFKAL80ETC concert", 10, 49),
                new Item("Entradas para o Backstage do TAFKAL80ETC concert", 5, 49),
                // este item Conjurado não está funcionando adequadamente
                new Item("Bolo de Mana Conjurado", 3, 6) };

        RosaDourada aplicacao = new RosaDourada(itens);

        int dias = 2;

        for (int i = 0; i < dias; i++) {
            System.out.println("-------- dia " + i + " --------");
            System.out.println("nome, venderEm, qualidade");
            for (Item item : itens) {
                System.out.println(item);
            }
            System.out.println();
            aplicacao.atualizaQualidade();
        }
    }
}
