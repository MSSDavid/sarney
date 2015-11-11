package br.ufg.inf.es.construcao.projeto;

public class Produto {
    
    public static int produto(int a, int b) {
        if  ((a < 0) || (b < 0)) {
            throw new IllegalArgumentException("Algum dos números é menor que 0");
        }
        
        int r = a * b;
        
        return r;
    }
    
}
