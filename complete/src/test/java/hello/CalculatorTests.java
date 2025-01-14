package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorTests {

    @Test
    public void testExpressionSuccess() {
        // Тест, що проходить
        Expression exp = new ExpressionBuilder("1+1").build();
        double result = exp.evaluate();
        assertEquals(2, result, "Обчислення виразу '1+1' повинно дати результат 2");
    }
    
     @Test
    public void testExpressionFailure() {
        // Тест, що завжди буде провалюватись
        Expression exp = new ExpressionBuilder("5-1").build();
        double result = exp.evaluate();
        assertEquals(2, result, "Обчислення виразу '5-1' повинно дати результат 2 (але це неправда)");
    } 
    
}