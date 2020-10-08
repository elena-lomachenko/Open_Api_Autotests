package Other;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OptionsTests {

  public static final String CHROME_DRIVER_PATH = "C:\\Users\\elena\\drivers\\chromedriver_win32\\chromedriver.exe";
  public WebDriver driver;
  public static WebDriverWait wait;

  // Создание свойств драйвера - задаём путь, отключаем расширения
  static ChromeOptions getChromeOptions() {
    System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

    final var options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.setExperimentalOption("useAutomationExtension", false);
    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

    return options;
  }

  // Создание сервсиа драйвера - логирование и прочее тут
  static ChromeDriverService getChromeService() {
    return new ChromeDriverService.Builder()
        .withSilent(true)
        .withLogFile(null)
        .build();
  }

  // Создаём сам драйвер
  public void start() {

    var s = getChromeService();
    var o = getChromeOptions();

    driver = new ChromeDriver(s, o);

    final var options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.setExperimentalOption("useAutomationExtension", false);
    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

    wait = new WebDriverWait(driver, 10);
  }

  public void stop() {

  }
}

