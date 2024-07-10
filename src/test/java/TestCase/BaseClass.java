package TestCase;

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

public class BaseClass {
   public static WebDriver driver;
    public Logger logger;
    public Properties p;

    @BeforeClass(groups = {"Sanity","Regression", "Master"})
    @Parameters({"os","browser"})
    public void setUp(String os, String br) throws IOException {

        //Loading Config File
        FileReader file= new FileReader("./src//test//Resource//config.properties");
        p= new Properties();
        p.load(file);


        logger= LogManager.getLogger(this.getClass());
        switch (br.toLowerCase()) {

            case "chrome": driver=new ChromeDriver(); break;
            case "edge": driver=new EdgeDriver(); break;
            case "firefox": driver=new FirefoxDriver(); break;
            default: System.out.println("Browser Not Found");
            return;

        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("appURL"));
        driver.manage().window().maximize();


    }

    @AfterClass(groups = {"Sanity","Regression", "Master"})
    public void tearDown()
    {
        driver.quit();
    }

    public String randomString()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(6);
        return generatedString;
    }

    public String randomNumber()
    {
        String generatedNumber= RandomStringUtils.randomNumeric(10);
        return generatedNumber;
    }

    public String randomAlphaNumeric()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(4);
        String generatedNumber= RandomStringUtils.randomNumeric(4);
        return (generatedString+"@"+generatedNumber);
    }

    public String captureScreen(String tname)
    {
        String timeStamp= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takeScreenshot = ((TakesScreenshot)driver);
        File sourceFile= takeScreenshot.getScreenshotAs(OutputType.FILE);
        String targetFilePath= System.getProperty("user.dir")+"//screenshots//"+tname+" "+timeStamp+".png";
        File targetFile = new File(targetFilePath);
        sourceFile.renameTo(targetFile);
        return targetFilePath;

    }
}
