import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getLionMealTest() throws Exception {
        Lion lion = new Lion(feline,"Самка");
        List<String> exception = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Такое есть не будет", lion.getFood(), exception);
    }

    @Test(expected = Exception.class)
    public void hasManeExceptionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Другое");
        lion.doesHaveMane();
    }

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline, "Самец");
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
    }
}