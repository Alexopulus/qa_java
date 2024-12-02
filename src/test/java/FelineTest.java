import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;


import static org.junit.Assert.assertEquals;


public class FelineTest {


    @Test
    public void getFelineMealTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedMeal = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeal = feline.eatMeat();
        Assert.assertEquals("Такое есть не будет", expectedMeal, actualMeal);
    }


    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Не верный вид животного", expectedFamily, actualFamily);

    }


    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        assertEquals("Не верное количество котят", expectedKittens, actualKittens);
    }

}