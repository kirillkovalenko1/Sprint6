import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FelineMockTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List expectedResult = List.of("Животные", "Птицы", "Рыба");
        List actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);

    }
}

