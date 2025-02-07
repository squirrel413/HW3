import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIntExp {
    @Test
    public void testIntExpression() {
        Expression root = new IntExp(10);
        assertEquals(10, root.evaluate());
        assertEquals("10", root.emit());
    }
}
