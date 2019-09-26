import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;


public class PrimeFactors {

    public static List<Integer> of(int n) {
        List<Integer> factors = Lists.newArrayList();
        if (n > 1) {
            while (n % 2 == 0) {
                factors.add(2);
                n /= 2;
            }
        }
            if (n > 1)
                factors.add(n);
        return factors;
    }
}
