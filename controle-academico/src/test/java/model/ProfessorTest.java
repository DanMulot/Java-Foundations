package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProfessorTest {
     @Test
    public void testConstrutorComParametros() {
        Professor professor = new Professor(
                "Paulo",
                "Rua 1",
                39,
                "234567890",
                "Ti"

        );
        assertEquals("Paulo",professor.getNome());
        assertEquals("Rua 1",professor.getEndereco());
        assertEquals(39 ,professor.getIdade());
        assertEquals("234567890" ,professor.getCPF());
        assertEquals("Ti" ,professor.getAtuacao());
        assertTrue(professor.getMatricula() > 0 && professor.getMatricula() < 10000);
    }
    @Test
    public void testConstrutorsemParametros() {
       Professor professor = new Professor();
       professor.setNome("Paulo");
       professor.setEndereco("Rua 1");
       professor.setIdade(39);
       int matricula = professor.gerarMatricula();
       professor.setMatricula(matricula);

       assertEquals("Paulo", professor.getNome());
       assertEquals("Rua 1", professor.getEndereco());
       assertEquals(39, professor.getIdade());
       assertTrue(professor.gerarMatricula() > 0 && professor.getMatricula() < 10000);
    }
}
