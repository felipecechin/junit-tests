package exercicio8;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import votacao.Votacao;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {
    String nome;
    int anoDeNascimento;
    String resultado;

    public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.resultado = resultado;
    }

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
