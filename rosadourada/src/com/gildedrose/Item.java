package com.gildedrose;

public class Item {

    public String nome;

    public int venderEm;

    public int qualidade;

    public Item(String nome, int venderEm, int qualidade) {
        this.nome = nome;
        this.venderEm = venderEm;
        this.qualidade = qualidade;
    }

   @Override
   public String toString() {
        return this.nome + ", " + this.venderEm + ", " + this.qualidade;
    }
}
