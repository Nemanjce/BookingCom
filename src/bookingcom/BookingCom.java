package bookingcom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Aida
 */
public class BookingCom
{

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");

        WebElement destinationField = driver.findElement(By.id("ss"));
        destinationField.sendKeys("Belgrade");

        WebElement checkInBtn = driver.findElement(By.className("c2-wrapper-s-checkin"));
        checkInBtn.click();

        WebElement checkInDate = driver.findElement(By.className("c2-day-s-today"));
        checkInDate.click();

        WebElement checkOutBtn = driver.findElement(By.className("c2-wrapper-s-checkout"));
        checkOutBtn.click();

        List<WebElement> checkOutDates = driver.findElements(By.cssSelector("#frm > div.xp__fieldset > div.xp__dates > div > div:nth-child(3) > div > div > div > div.c2-calendar > div.c2-calendar-body > div.c2-calendar-viewport > div > div > div:nth-child(1) > table > tbody > tr:last-child > td.c2-day"));

        checkOutDates.get(checkOutDates.size() - 1).click();

        WebElement personsField = driver.findElement(By.id("xp__guests__toggle"));
        personsField.click();

        Select comboRooms = new Select(driver.findElement(By.id("no_rooms")));
        comboRooms.selectByValue("4");

        Select comboAdults = new Select(driver.findElement(By.id("group_adults")));
        comboAdults.selectByValue("8");

        Select comboChildren = new Select(driver.findElement(By.id("group_children")));
        comboChildren.selectByValue("2");

        Select comboFirstChild = new Select(driver.findElement(By.cssSelector("[aria-label=\"Child 1 age\"]")));
        comboFirstChild.selectByValue("12");

        Select comboSecondChild = new Select(driver.findElement(By.cssSelector("[aria-label=\"Child 2 age\"]")));
        comboSecondChild.selectByValue("12");

        WebElement searchBtn = driver.findElement(By.className("sb-searchbox__button  "));
        searchBtn.click();

    }

}
