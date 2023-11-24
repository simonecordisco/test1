import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing=new Main();
    @Test
    void sum() {
        Integer result =testing.sum(1,2);
        assertEquals(3,result,"mi aspetto 3");
    }
}