package base;

import globalResource.GLOBAL_STATIC;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public void launchBrowser() throws IOException {
        loadProperties();

        String  br = System.getProperty("browserName");
        if(br == null){
            br = GLOBAL_STATIC.prop.getProperty("browser");
            openSpecificBrowser(br);
        } else
            openSpecificBrowser(br);

        GLOBAL_STATIC.driver.manage().window().maximize();
        GLOBAL_STATIC.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public void openSpecificBrowser(String browser){
        if(browser.equals("Chrome")|| browser.equals("chrome") ) {
            GLOBAL_STATIC.driver = new ChromeDriver();
        }
        if(browser.equals("Firefox")|| browser.equals("firefox") || browser.equals("FF") )
        {
            GLOBAL_STATIC.driver = new FirefoxDriver();
        }
        if (browser.equals("Edge")) {
            GLOBAL_STATIC.driver = new EdgeDriver();
        }
    }



    public void loadProperties() throws IOException {
        FileInputStream file = new FileInputStream("src/main/java/config/config.properties");
        GLOBAL_STATIC.prop = new Properties();
        GLOBAL_STATIC.prop.load(file);

    }
}
