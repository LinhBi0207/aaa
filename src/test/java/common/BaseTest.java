package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeSuite;
import testdata.GlobalContants;

import java.io.File;

public class BaseTest extends AbstractPage {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    @BeforeSuite
    protected void deleteFileInReport() {
        deleteAllFileInFolder("allure-json");
        deleteAllFileInFolder("logs");
    }
    protected WebDriver getBrowserDriver(String browserName) {
        switch (browserName) {
            case "chrome":
                //WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                //WebDriverManager.firefoxdriver().clearDriverCache().setup();
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new RuntimeException("Please enter the correct Browser name!!!");
        }

        maximizeBrowsers(driver);
        implicitWaitBrowser(driver);
        return driver;
    }


    protected WebDriver quitBrowser() {
        closeBrowsers(driver);
        return driver;
    }

    protected void deleteAllFileInFolder(String folderName) {
        try {
            String pathFolderDownload = GlobalContants.PROJECT_PATH + File.separator + folderName;
            File file = new File(pathFolderDownload);
            File[] listOfFiles = file.listFiles();
            for (int i = 0; i < (listOfFiles != null ? listOfFiles.length : 0); i++) {
                if (listOfFiles[i].isFile() && !listOfFiles[i].getName().equals("environment.properties")) {
                    new File(listOfFiles[i].toString()).delete();
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}

