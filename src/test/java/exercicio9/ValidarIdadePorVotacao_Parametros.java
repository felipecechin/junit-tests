package exercicio9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import votacao.Votacao;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_Parametros {

    @Parameterized.Parameter(0)
    public String nome;
    @Parameterized.Parameter(1)
    public int anoDeNascimento;
    @Parameterized.Parameter(2)
    public String resultado;

    @Parameterized.Parameters(name = "{0} | {1} | {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Maria", 2005, "Maria voce nao pode votar"},
                {"Rodrigo", 2004, "Rodrigo seu voto e facultativo"}
        });
    }

    @Test
    public void validarObrigatoridadeDeVoto() {
        Assert.assertEquals(this.resultado, Votacao.podeVotar(this.nome, this.anoDeNascimento));
    }
}
