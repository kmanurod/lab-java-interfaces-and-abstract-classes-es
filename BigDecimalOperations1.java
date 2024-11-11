import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations1 {

    public static double roundToHundredth(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("4.2545");
        System.out.println(roundToHundredth(value));  // Debería imprimir 4.25
    }
}
