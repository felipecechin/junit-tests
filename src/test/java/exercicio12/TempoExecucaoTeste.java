package exercicio12;

import org.junit.Assert;
import org.junit.Test;

public class TempoExecucaoTeste {

    @Test(timeout = 1000)
    public void naoPassaPeloTimeout() {
        Assert.assertTrue(true);
    }

    @Test(timeout = 1000)
    public void apresentaErroTimeout() {
        try {
            Thread.sleep(1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
