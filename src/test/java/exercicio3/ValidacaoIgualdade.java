package exercicio3;

import org.junit.Assert;
import org.junit.Test;

public class ValidacaoIgualdade {

    @Test
    public void validacaoIgualdade_Sucesso() {
        String resultadoObtido = "Registro salvo com sucesso!";
        Assert.assertEquals("Registro salvo com sucesso!", resultadoObtido);
    }

    @Test
    public void validacaoIgualdade_Falha() {
        String resultadoObtido = "Registro excluido com sucesso!";
        Assert.assertEquals("Registro salvo com sucesso!", resultadoObtido);
    }
}
