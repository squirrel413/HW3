import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSubExp {
    @Test
    public void testSubExp() {
        Expression root = new SubExp(new IntExp(10), new IntExp(5));
        assertEquals(5, root.evaluate());
        assertEquals("(10 - 5)", root.emit());
    }

    @Test
    public void testSubExpComplex(){
        Expression root = new SubExp(
                new SubExp(new IntExp(20), new IntExp(5)),
                new SubExp(new IntExp(10), new IntExp(5)));
        assertEquals(10, root.evaluate());
        assertEquals("((20 - 5) - (10 - 5))", root.emit());
    }
}
