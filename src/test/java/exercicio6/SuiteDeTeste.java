package exercicio6;

import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVerdadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicoesDeTeste;
import exercicio5.PreEPosCondicaoDaClasse;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MeuPrimeiroTeste.class,
        ValidacaoVerdadeiroFalso.class,
        ValidacaoIgualdade.class,
        PreEPosCondicoesDeTeste.class,
        PreEPosCondicaoDaClasse.class
})
public class SuiteDeTeste {

}
