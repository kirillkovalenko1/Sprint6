import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String actualResult = animal.getFamily();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedResult, actualResult);

    }

    @Test(expected = Exception.class)
    public void getFoodExceptionTest() throws Exception {
        Animal animal = new Animal();
        List actualResult = animal.getFood("Test");
    }
}
