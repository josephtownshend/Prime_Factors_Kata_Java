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

    @Test
    public void of_2is2() {
        assertThat(PrimeFactors.of(2), CoreMatchers.<List<Integer>>is(ImmutableList.<Integer>of(2)));
    }

    @Test
    public void of_3is3() {
        assertThat(PrimeFactors.of(3), CoreMatchers.<List<Integer>>is(ImmutableList.<Integer>of(3)));
    }

    @Test
    public void of_3is2_2() {
        assertThat(PrimeFactors.of(4), CoreMatchers.<List<Integer>>is(ImmutableList.<Integer>of(2,2)));
    }

    @Test
    public void of_6is2_3() {
        assertThat(PrimeFactors.of(6), CoreMatchers.<List<Integer>>is(ImmutableList.<Integer>of(2,3)));
    }

    @Test
    public void of_8is2_2_2() {
        assertThat(PrimeFactors.of(8), CoreMatchers.<List<Integer>>is(ImmutableList.<Integer>of(2,2,2)));
    }

    @Test
    public void of_9is3_3() {
        assertThat(PrimeFactors.of(9), CoreMatchers.<List<Integer>>is(ImmutableList.<Integer>of(3,3)));
    }
}
