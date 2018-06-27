import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import java.io.PrintWriter
import java.io.Writer

fun main(args: Array<String>) {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Job/Desktop/selinium/chromedriver.exe")
    val jack:selenium2 = selenium2()
    writer(jack.AddisFortune(),1)
    //jack.Facebook()
//    writer(jack.skysports(),2)


}

fun writer(value:String,I:Int){
    val writer:PrintWriter = PrintWriter("html"+I+".html","UTF-8")
    writer.write(value)
    print(value)
}

