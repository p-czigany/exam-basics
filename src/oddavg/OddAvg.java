package oddavg;

import java.util.List;

/**
 * Created by peter on 2017.04.18..
 */
public class OddAvg {

  public double oddAverage(List<Integer> inputNumbers) {
    int oddCounter = 0;
    int oddSum = 0;
    for (int examinedNumber :
            inputNumbers) {
      if (examinedNumber % 2 == 1) {
        oddSum += examinedNumber;
        oddCounter++;
      }
    }
    return (double) oddSum / oddCounter;
  }
}
