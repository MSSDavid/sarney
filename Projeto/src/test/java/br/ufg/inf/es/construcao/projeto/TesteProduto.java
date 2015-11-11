package br.ufg.inf.es.construcao.projeto;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TesteProduto {
    
    @Test(expected = IllegalArgumentException.class)
    public void testetodososparametros() throws Exception {
        Produto.produto(-1, 0);
    }
    
    @Test
    public void testCasos() {
        Assert.assertEquals(27, Produto.produto(3, 9));
    }
    
}