package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleForms {
    private final ChromeDriver driver;

    public GoogleForms(ChromeDriver driver) {
        this.driver = driver;
    }

    public void abrirForms(String forms) {
        driver.get(forms);
    }

    public void preencherEmail(String email) {
        WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
        element.sendKeys(email + Keys.ENTER);
        System.out.println(element.getAccessibleName());
    }

    public void submmit() {
        WebElement element = driver.findElement(By.cssSelector("div[role='button']"));
        System.out.println(element.getAccessibleName());
        element.click();
    }

    public void printarTitulo() {
        System.out.println(driver.getTitle());
    }
}
