package exercicio2;

import org.junit.Assert;
import org.junit.Test;

public class ValidacaoVerdadeiroFalso {

    @Test
    public void validacaoVerdadeiro_Sucesso() {
        boolean campoEstaPresente = true;
        Assert.assertTrue(campoEstaPresente);
    }

    @Test
    public void validacaoVerdadeiro_Falha() {
        boolean campoEstaPresente = true;
        Assert.assertFalse("Campo não está presente", campoEstaPresente);
    }
}
