import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Follow {

    // By coocki = new By.ByXPath("/html/body/div[4]/div/div/button[1]");
    By usernameloc = new By.ByXPath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input");
    By passwordloc = new By.ByXPath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input");
    By loginbuttun = new By.ByXPath("//*[@id=\"loginForm\"]/div/div[3]");

    By fallowersCountloc = new By.ByXPath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/section/main/div/header/section/ul/li[2]/a/div");


    WebDriver driver;
    String BASE_URL = "https://www.instagram.com/";

    public Follow(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamad\\IdeaProjects\\AutoInsta\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get(BASE_URL);

    }

    public void login(String username,String password) throws InterruptedException {
        //  Thread.sleep(8000);
        // driver.findElement(coocki).click();
        Thread.sleep(9000);
        driver.findElement(usernameloc).sendKeys(username);
        driver.findElement(passwordloc).sendKeys(password);
        Thread.sleep(8000);

        driver.findElement(loginbuttun).click();
    }
    public void navigateToProfile(String username) throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().to(BASE_URL.concat(username));

    }

    public  void clickFallowers() throws InterruptedException {
        Thread.sleep(8000);
        driver.findElements(fallowersCountloc).get(0).click();
    }


    public void startFallow() throws InterruptedException {
        int count = 100;
        int number = 1;
        int fallowedNumber = 1;
        Thread.sleep(6000);
        while (0<count && number <100&& fallowedNumber<100){
            Thread.sleep(70000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div["+number+"]/div[3]/button/div/div")).click();

            System.out.println("["+fallowedNumber+"]"+"person followed");
            number++;
            count++;
            fallowedNumber++;

        }


    }}