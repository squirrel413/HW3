import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddExp {
    @Test
    public void testAddExpressionInt() {
        Expression root = new AddExp(new IntExp(10), new IntExp(20));
        assertEquals(30, root.evaluate());
        assertEquals("(10 + 20)", root.emit());
    }

    @Test
    public void testAddExpressionComplex() {
        Expression root = new AddExp(
                new AddExp(new IntExp(10), new IntExp(20)),
                new AddExp(new IntExp(30), new IntExp(40)));
        assertEquals(100, root.evaluate());
        assertEquals("((10 + 20) + (30 + 40))", root.emit());
    }
}

