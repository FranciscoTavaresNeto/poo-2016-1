package com.gildedrose;

public class RosaDourada {
	Item[] itens;

	public RosaDourada(Item[] itens) {
		this.itens = itens;
	}

	public void atualizaQualidade() {
		for (int i = 0; i < itens.length; i++) {
			if (!itens[i].nome.equals("Brie Envelhecido")
					&& !itens[i].nome.equals("Entradas para o Backstage do TAFKAL80ETC concert")) {
				if (itens[i].qualidade > 0) {
					if (!itens[i].nome.equals("Sulfuras, Mão de Ragnaros")) {
						itens[i].qualidade = itens[i].qualidade - 1;
					}
				}
			} else {
				if (itens[i].qualidade < 50) {
					itens[i].qualidade = itens[i].qualidade + 1;

					if (itens[i].nome.equals("Entradas para o Backstage do TAFKAL80ETC concert")) {
						if (itens[i].venderEm < 11) {
							if (itens[i].qualidade < 50) {
								itens[i].qualidade = itens[i].qualidade + 1;
							}
						}

						if (itens[i].venderEm < 6) {
							if (itens[i].qualidade < 50) {
								itens[i].qualidade = itens[i].qualidade + 1;
							}
						}
					}
				}
			}

			if (!itens[i].nome.equals("Sulfuras, Mão de Ragnaros")) {
				itens[i].venderEm = itens[i].venderEm - 1;
			}

			if (itens[i].venderEm < 0) {
				if (!itens[i].nome.equals("Brie Envelhecido")) {
					if (!itens[i].nome.equals("Entradas para o Backstage do TAFKAL80ETC concert")) {
						if (itens[i].qualidade > 0) {
							if (!itens[i].nome.equals("Sulfuras, Mão de Ragnaros")) {
								itens[i].qualidade = itens[i].qualidade - 1;
							}
						}
					} else {
						itens[i].qualidade = itens[i].qualidade - itens[i].qualidade;
					}
				} else {
					if (itens[i].qualidade < 50) {
						itens[i].qualidade = itens[i].qualidade + 1;
					}
				}
			}
		}
	}
}
