import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import oddavg.OddAvg;

/**
 * Created by peter on 2017.04.18..
 */
public class OddAvgTest {

    OddAvg odder = new OddAvg();

    @Test
    void testOne() {
      List<Integer> numberses = new ArrayList<>();
      numberses.add(1);
      numberses.add(2);
      numberses.add(4);
      assertEquals(1, odder.oddAverage(numberses));
    }

  @Test
  void testTwo() {
    List<Integer> numberses = new ArrayList<>();
    numberses.add(1);
    numberses.add(2);
    numberses.add(4);
    numberses.add(4);
    numberses.add(3);
    assertEquals(2.0, odder.oddAverage(numberses));
  }

  @Test
  void testThree() {
    List<Integer> numberses = new ArrayList<>();
    numberses.add(1);
    numberses.add(2);
    numberses.add(4);
    numberses.add(4);
    numberses.add(3);
    numberses.add(3);
    assertFalse(odder.oddAverage(numberses) == 2.0d);
  }
}
