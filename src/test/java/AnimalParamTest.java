import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalParamTest {
    private String animalKind;
    private List animalList;

    public AnimalParamTest(String animalKind, List animalList) {
        this.animalKind = animalKind;
        this.animalList = animalList;
    }

    @Parameterized.Parameters(name = "animalKind = {0}, animalList = {1}")
    public static Object[][] getData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        assertEquals(animalList, animal.getFood(animalKind));
    }
}
