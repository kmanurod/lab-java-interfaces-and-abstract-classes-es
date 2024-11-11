import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations2 {

    public static double invertAndRoundToTenth(BigDecimal value) {
        BigDecimal inverted = value.negate();
        return inverted.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal("1.2345");
        BigDecimal value2 = new BigDecimal("-45.67");
        
        System.out.println(invertAndRoundToTenth(value1));  // Debería imprimir -1.2
        System.out.println(invertAndRoundToTenth(value2));  // Debería imprimir 45.7
    }
}
