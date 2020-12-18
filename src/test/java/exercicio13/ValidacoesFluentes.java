package exercicio13;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ValidacoesFluentes {

    @Test
    public void validacaoEqualsTo() {
        String produto = "TV 40 polegadas";
        Assert.assertThat(produto, CoreMatchers.equalTo("TV 40 polegadas"));
    }

    @Test
    public void validacaoIs() {
        int codigo = 50;
        Assert.assertThat(codigo, CoreMatchers.is(50));
    }

    @Test
    public void validacaoAnyOf() {
        String resultadoObtido = "A cor selecionada foi vermelha.";
        Assert.assertThat(resultadoObtido, CoreMatchers.anyOf(CoreMatchers.containsString("vermelho"), CoreMatchers.containsString("vermelha")));
    }

    @Test
    public void validacaoHasItems() {
        List<String> listaProdutos = new ArrayList<>();
        listaProdutos.add("Iphone 8");
        listaProdutos.add("Samsung");
        listaProdutos.add("TV");
        Assert.assertThat(listaProdutos, CoreMatchers.hasItem("Iphone 8"));
    }
}
