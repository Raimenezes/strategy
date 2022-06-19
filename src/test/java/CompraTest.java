import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CompraTest {

    @Test
    public void deveSomarValorNotasCompras() {
        Compra compra = new Compra();
        compra.somarNota(80.0f, 40.0f);
        assertEquals(120.0f, compra.getNota(), 0.0);
    }

    @Test
    public void deveSubtrairValorNotasCompras() {
        Compra compra = new Compra();
        compra.subtrairNota(80.0f, 40.0f);
        assertEquals(40.0f, compra.getNota(), 0.0);
    }

    @Test
    public void deveMultiplicarValorNotasCompras() {
        Compra compra = new Compra();
        compra.multiplicarNota(80.0f, 2.0f);
        assertEquals(160.0f, compra.getNota(), 0.0);
    }

    @Test
    public void deveDividirValorNotasCompras() {
        Compra compra = new Compra();
        compra.dividirNota(80.0f, 4.0f);
        assertEquals(20.0f, compra.getNota(), 0.0);
    }

    @Test
    public void naoDeveDividirValorNotasCompras() {
        try {
            Compra compra = new Compra();
            compra.dividirNota(80.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    public void deveCalcularValorMediaNotasCompra() {
        Compra compra = new Compra();
        compra.calcularMediaNotas(80.0f, 70.0f);
        assertEquals(75.0f, compra.getNota(), 0.0);
    }

}
