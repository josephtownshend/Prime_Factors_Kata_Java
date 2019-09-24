import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class PrimeFactorsTest {

    @Test
    public void of_1isNone() {
        assertThat(PrimeFactors.of(1), CoreMatchers.<List<Integer>>is(ImmutableList.<Integer>of()));
    }
}