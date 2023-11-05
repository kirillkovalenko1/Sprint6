import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    Feline feline;
    String sex = "Самец";
    String sexException = "Test";
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline,sex);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline,sex);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test(expected = Exception.class)
    public void lionExceptionTest() throws Exception {
        Lion lion = new Lion(feline,sexException);
    }
}
