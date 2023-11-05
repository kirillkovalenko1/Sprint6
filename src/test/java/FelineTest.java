import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult,feline.getFamily());
    }
    @Test
    public void getKittensWithParamTest(){
        Feline feline = new Feline();
        int expectedResult = 2;
        assertEquals(expectedResult,feline.getKittens(2));
    }
    @Test
    public void getKittensWithoutParamTest(){
        Feline feline = new Feline();
        int expectedResult = 1;
        assertEquals(expectedResult,feline.getKittens());
    }
}

