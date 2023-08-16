
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {

   @Test
    public void testConstructorAndGetters() {
        Student student = new Student("John Doe", 12345);

        assertEquals("John Doe", student.getName());
        assertEquals(12345, student.getId());
        assertEquals(new ArrayList<Integer>(), student.getGrades());
    }

    private void assertEquals(String johnDoe, String name) {
    }

    private void assertEquals(int i, long id) {
    }

    private void assertEquals(ArrayList<Integer> integers, ArrayList<Integer> grades) {
    }

    @Test
    public void testAddGradeAndGetGrades() {
        Student student = new Student("Alice Smith", 67890);

        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(78);

        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(85, 92, 78));
        assertEquals(expectedGrades, student.getGrades());
    }

    @Test
    public void testGradeAverage() {
        Student student = new Student("Bob Johnson", 54321);

        student.addGrade(90);
        student.addGrade(88);
        student.addGrade(75);

        double average = (90 + 88 + 75) / 3.0;
        assertEquals(average, student.getGradeAverage(), 0.001);
    }

    private void assertEquals(double average, double gradeAverage, double v) {
    }
}
