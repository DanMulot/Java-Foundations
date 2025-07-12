package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnderecoTest {
    @Test
    public void testConstrutorComParametros() {
        Endereco end = new Endereco(
                "186000",
                "52",
                "Casa");

        assertEquals("186000", end.getCep());
        assertEquals("52", end.getNumero());
        assertEquals("Casa", end.getComplemento());
    }
}
