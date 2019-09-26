import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;


public class PrimeFactors {

    public static List<Integer> of(int n) {
        List<Integer> factors = Lists.newArrayList();
        int divisor = 2;
        while (n > 1) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }
            if (n > 1)
                factors.add(n);
        return factors;
    }
}
