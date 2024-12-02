import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getCatSoundTest() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals("Кошка так не говорит", expectedSound, actualSound);
    }

    @Test
    public void getCatMealTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedMeal = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeal = cat.getFood();
        Assert.assertEquals("Неправильный список еды", expectedMeal, actualMeal);
    }
}