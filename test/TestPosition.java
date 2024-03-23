import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TestPosition {

    @Test
    public void testOrigin() {
        assertEquals("Trùng điểm O", test.pos(0, 0));
    }

    @Test
    public void testXAxis() {
        assertEquals("Trục hoành", test.pos(0, 5));
        assertEquals("Trục hoành", test.pos(0, -3));
    }

    @Test
    public void testYAxis() {
        assertEquals("Trục tung", test.pos(6, 0));
        assertEquals("Trục tung", test.pos(-2, 0));
    }

    @Test
    public void testQuadrant1() {
        assertEquals("Góc 1/4 thứ 1", test.pos(2, 3));
        assertEquals("Góc 1/4 thứ 1", test.pos(10, 7));
    }

    @Test
    public void testQuadrant2() {
        assertEquals("Góc 1/4 thứ 2", test.pos(-2, 5));
        assertEquals("Góc 1/4 thứ 2", test.pos(-6, 3));
    }

    @Test
    public void testQuadrant3() {
        assertEquals("Góc 1/4 thứ 3", test.pos(-4, -2));
        assertEquals("Góc 1/4 thứ 3", test.pos(-8, -9));
    }

    @Test
    public void testQuadrant4() {
        assertEquals("Góc 1/4 thứ 4", test.pos(3, -4));
        assertEquals("Góc 1/4 thứ 4", test.pos(7, -8));
    }
}
