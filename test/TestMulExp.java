import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMulExp {
    @Test
    public void testMulExp() {
        Expression root = new MulExp(new IntExp(10), new IntExp(5));
        assertEquals(50, root.evaluate());
        assertEquals("(10 * 5)", root.emit());
    }

    @Test
    public void testMulExpComplex(){
        Expression root = new MulExp(
                new MulExp(new IntExp(2), new IntExp(5)),
                new MulExp(new IntExp(3), new IntExp(4)));
        assertEquals(120, root.evaluate());
        assertEquals("((2 * 5) * (3 * 4))", root.emit());
    }
}


