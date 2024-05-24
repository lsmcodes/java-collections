package io.github.lsmcodes.collections.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

        private long codigo;
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(long codigo, String nome, double preco, int quantidade) {
                this.codigo = codigo;
                this.nome = nome;
                this.preco = preco;
                this.quantidade = quantidade;
        }

        public long getCodigo() {
                return codigo;
        }

        public String getNome() {
                return nome;
        }

        public double getPreco() {
                return preco;
        }

        public int getQuantidade() {
                return quantidade;
        }

        @Override
        public boolean equals(Object obj) {
                if(this == obj) return true;
                if(!(obj instanceof Produto produto)) return false;
                return Objects.equals(getNome(), produto.getNome());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getNome());
        }

        @Override
        public String toString() {
                return "Código: " + codigo + " - Produto: " + nome + ", preço: R$" + preco + ", quantidade: " + quantidade;
        }

        @Override
        public int compareTo(Produto produto) {
                return nome.compareToIgnoreCase(produto.getNome());
        }

}

class CompararPreco implements Comparator<Produto> {

        @Override
        public int compare(Produto p1, Produto p2) {
                return Double.compare(p1.getPreco(), p2.getPreco());
        }

}