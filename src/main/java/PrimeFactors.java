import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;


public class PrimeFactors {

    public static List<Integer> of(int n) {
        List<Integer> factors = Lists.newArrayList();
        if (n == 2) {
            factors.add(2);
        }
        return factors;
    }
}
