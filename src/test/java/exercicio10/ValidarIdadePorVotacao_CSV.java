package exercicio10;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import votacao.Votacao;

@RunWith(JUnitParamsRunner.class)
public class ValidarIdadePorVotacao_CSV {


    @Test
    @FileParameters(value = "src/test/java/exercicio10/massa_de_dados.csv", mapper = CsvWithHeaderMapper.class)
    public void validarObrigatoridadeDeVoto(String nome, int anoDeNascimento, String resultado) {
        Assert.assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
    }
}
