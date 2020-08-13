import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradeTest {
    @Test
    public void testCalculateGradeOfTwoValues() {
        int quality = 5;
        int formalization = 2;
        double assertMean = 3.5;
        final Grade gr = new Grade(quality, formalization);
        assertEquals(gr.calculateGrade(), assertMean, 0.01);
    }

    @Test
    public void testCalculateGradeOfTreeValues() {
        int quality = 5;
        int formalization = 2;
        int speed = 5;
        double assertMean = 4;
        final Grade gr = new Grade(quality, formalization, speed);
        assertEquals(gr.calculateGrade(), assertMean, 0.01);
    }

    @Test
    public void testCalculateGradeOfFourValues() {
        int quality = 4;
        int formalization = 0;
        int speed = 3;
        int politeness = 1;
        double assertMean = 2;
        final Grade gr = new Grade(quality, formalization, speed, politeness);
        assertEquals(gr.calculateGrade(), assertMean, 0.01);
    }

    @Test
    public void testGetters() {
        final Grade gr = new Grade(12, 3, 4, 2);
        int q = gr.getQuality();
        assertEquals(12, q);
        int f = gr.getFormalization();
        assertEquals(3, f);
        int s = gr.getSpeed();
        assertEquals(4, s);
        int p = gr.getPoliteness();
        assertEquals(2, p);
    }

    @Test
    public void testSetters() {
        final Grade gr = new Grade(0, 0, 0, 0);
        gr.setQuality(12);
        assertEquals(12, gr.getQuality());
        gr.setFormalization(3);
        assertEquals(3, gr.getFormalization());
        gr.setSpeed(4);
        assertEquals(4, gr.getSpeed());
        gr.setPoliteness(2);
        assertEquals(2, gr.getPoliteness());
    }
}
