import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UtilsTest {

  @Test
  public void testSex() {
    String p1 = "Masha";
    String p2 = "Lera";
    String expecting = p1 + " having sex with " + p2;

    assertEquals(Utils.sex(p1, p2), expecting);
  }
}