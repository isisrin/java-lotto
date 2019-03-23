package lottery.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LotteryNumberTest {

    private  LotteryNumberSet lotteryNumberSet = new LotteryNumberSet();

    @Test
    public void 자동값테스트() {
        LotteryNumber number = new LotteryNumber() {
            @Override
            List<Integer> suffle(List<Integer> lotteryNumbers) {
                return Arrays.asList(1,2,3,4,5,6);
            }
        };
        List<Integer> result = number.extractRandomNumbers();
        assertThat(result).isEqualTo(Arrays.asList(1,2,3,4,5,6));

    }

    @Test
    public void 당첨번호조회() {
        LotteryNumber number = new LotteryNumber() {
            @Override
            List<Integer> suffle(List<Integer> lotteryNumbers) {
                return Arrays.asList(1,2,3,4,5,6);
            }
        };

        assertThat(number.compareNumbers(new LotteryNumber() {
            @Override
            List<Integer> suffle(List<Integer> lotteryNumbers) {
                return Arrays.asList(1,2,3,4,5,6);
            }
        })).isEqualTo(1);
    }
}