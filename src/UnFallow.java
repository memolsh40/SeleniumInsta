import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnFallow {




        // By coocki = new By.ByXPath("/html/body/div[4]/div/div/button[1]");
        By usernameloc = new By.ByXPath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input");
        By passwordloc = new By.ByXPath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input");
        By loginbuttun = new By.ByXPath("//*[@id=\"loginForm\"]/div/div[3]");

        By fallowingCountloc = new By.ByXPath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/section/main/div/header/section/ul/li[3]/a");
        By siteCoockies = new By.ByXPath("/html/body/div[4]/div[1]/div/div[2]/div/div/div/div/div[2]/div/button[1]");

        By selfProfile = new By.ByXPath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[8]/div/span/div/a/div/div[1]/div/div/span/img");
        WebDriver driver;
        String BASE_URL = "https://www.instagram.com/";

    public UnFallow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\SRC\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get(BASE_URL);
        Thread.sleep(10000);
        driver.findElement(siteCoockies).click();
    }

    public void login(String username, String password) throws InterruptedException {
            //  Thread.sleep(8000);
            // driver.findElement(coocki).click();
            Thread.sleep(9000);
            driver.findElement(usernameloc).sendKeys(username);
            driver.findElement(passwordloc).sendKeys(password);
            Thread.sleep(8000);

            driver.findElement(loginbuttun).click();
        }
        public void navigateToSelfProfile() throws InterruptedException {
            Thread.sleep(5000);
            driver.findElement(selfProfile).click();

        }

        public  void clickFallowing() throws InterruptedException {
            Thread.sleep(8000);
            driver.findElements(fallowingCountloc).get(0).click();
        }


        public void startUnFallow() throws InterruptedException {
            int count = 100;
            int number = 1;
            int unFallowedNumber = 1;
            Thread.sleep(1000);
            while (0<count && number <100&& unFallowedNumber<100){
                Thread.sleep(30000);
                driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[4]/div[1]/div/div["+number+"]/div/div/div/div[3]/div/button/div/div")).click();
                Thread.sleep(1500);
                driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[2]/div/div/div/div/div/div/button[1]")).click();
                System.out.println("["+unFallowedNumber+"]"+"person unfollowed");
                number++;
                count++;
                unFallowedNumber++;


            }


        }}

