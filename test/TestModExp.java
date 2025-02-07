import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestModExp {
    @Test
    public void testModExp() {
        Expression root = new ModExp(new IntExp(14), new IntExp(6));
        assertEquals(2, root.evaluate());
        assertEquals("(14 % 6)", root.emit());
    }

    @Test
    public void testSubExpComplex(){
        Expression root = new ModExp(
                new ModExp(new IntExp(237), new IntExp(5)),
                new ModExp(new IntExp(17), new IntExp(3)));
        assertEquals(0, root.evaluate());
        assertEquals("((237 % 5) % (17 % 3))", root.emit());
    }
}