import org.omg.CORBA.Any;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class selenium2{
    public static void a() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/Job/Desktop/selinium/chromedriver.exe");
        }
    WebDriver driver = new ChromeDriver();

public String Facebook() {
    driver.get("https://www.facebook.com/");
    String title = driver.getTitle();
    String a = driver.getCurrentUrl();
    String b = driver.getPageSource();

    WebElement email = driver.findElement(By.name("email"));
    WebElement password = driver.findElement(By.name("pass"));
    WebElement Button = driver.findElement(By.id("u_0_2"));
    email.sendKeys("eyobyirgu@gmail.com");
    password.sendKeys("Bringiton0937112506");
    Button.click();

    WebElement notification = driver.findElement(By.id("notificationsCountValue"));
    String notification_holder = notification.getAttribute("innerHTML");
    System.out.println(notification_holder);
return  notification_holder;
}
public String AddisFortune() {
        driver.get("https://addisfortune.net/");
        String title = driver.getTitle();
        String a = driver.getCurrentUrl();
        String b = driver.getPageSource();
    WebElement lists = driver.findElement(By.xpath("//*[@id=\"addisfortune-main\"]/div/div[1]/div[2]/div"));
    List<WebElement> header_news= (List<WebElement>)lists.findElements(By.tagName("h3"));
    List<WebElement> body= (List<WebElement>)lists.findElements(By.className("row"));

String Web="<!DOCTYPE html>\n" +
      "<html lang=\"en\">\n" +
        "\n" +
        "<head>\n" +
        "       <meta charset=\"UTF-8\">\n" +
        "       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
        "       <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
        "       <title>Document</title>\n" +
        "       <style>\n" +
        "        body{\n" +
        "            width:70%;\n" +
        "            margin-left: 15%;\n" +
        "\n" +
        "        }\n" +
        "        .single{\n" +
        "            box-shadow: 0px 1px 3px 1px #999999;\n" +
        "         height: 200px;\n" +
        "         margin-bottom: 14px;\n" +
        "\n" +
        "\n" +
        "        }\n" +
        "      .single:hover{\n" +
        "        box-shadow: 0px 10px 30px 0px #229;\n" +
        "      }\n" +
        "      .thumbnail{\n" +
        "          padding-top: 3%;\n" +
        "          float: left;\n" +
        "          width: 230px;\n" +
        "\n" +
        "      }\n" +
        "      a{\n" +
        "          padding-left: 300px;\n" +
        "          text-align-last: center;\n" +
        "          text-decoration-line: none;\n" +
        "      }\n" +
        "    </style>\n" +
        "</head>\n" +
        "\n" +
        "<body>\n<div class=\"conatain\">";
    for(int i = 0 ;i<header_news.size();i++){

        if(header_news.size()<1){break;}
        Web = Web + "<div class=\"single\">";
        Web = Web +header_news.get(i).getAttribute("innerHTML");
        Web = Web +body.get(i).findElement(By.className("span2")).getAttribute("innerHTML");
        Web = Web +body.get(i).findElement(By.className("span4")).getAttribute("innerHTML");
        Web = Web +"</div>";
    }
    Web = Web +"</div></body>\n" +
            "\n" +
            "</html>";
    return  Web;
}
}


