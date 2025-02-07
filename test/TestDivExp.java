import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivExp {
    @Test
    public void testDivExp() {
        Expression root = new DivExp(new IntExp(10), new IntExp(5));
        assertEquals(2, root.evaluate());
        assertEquals("(10 / 5)", root.emit());
    }

    @Test
    public void testDivExpComplex(){
        Expression root = new DivExp(
                new DivExp(new IntExp(20), new IntExp(5)),
                new DivExp(new IntExp(10), new IntExp(5)));
        assertEquals(2, root.evaluate());
        assertEquals("((20 / 5) / (10 / 5))", root.emit());
    }
}