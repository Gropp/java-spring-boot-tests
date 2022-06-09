package br.com.projectSpring.projeto.dio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import br.com.projectSpring.projeto.dio.Controller;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUnitController {
    @Test
    public void testUnit(){
        Controller controller = new Controller();
        String resultado = controller.mensagem1("DIO");
        assertEquals("Spring Test, DIO", resultado);
    }
}
