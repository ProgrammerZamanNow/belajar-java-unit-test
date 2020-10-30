package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSlow1() throws InterruptedException {
    Thread.sleep(4_000);
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSlow2() throws InterruptedException {
    Thread.sleep(4_000);
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSlow3() throws InterruptedException {
    Thread.sleep(4_000);
  }
}
