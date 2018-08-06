import org.junit.Test;

public class testVisitor {
    @Test
    public void testCreateGuest() {
        Visitor visitor1 = new Visitor(18,172,500);
        System.out.println(visitor1);
    }
}
