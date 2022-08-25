import org.openqa.selenium.chrome.ChromeDriver;
import scripts.GoogleForms;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Main {
    public static void main(String[] args) {
        String link="https://docs.google.com/forms/d/e/1FAIpQLSdQ39QKafKQtBnnKpkozSABVgnNO3ix_-bzdKqsm6-irWzZUQ/viewform";
        String parms = "?entry.1770752172=DJ%20Lessa%20(FUNK)&entry.295136228=Hyper";
        String linkfinal = link.concat(parms);


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        GoogleForms forms = new GoogleForms(driver);

        forms.abrirForms(linkfinal);
        forms.preencherEmail("fernado.lopes@gmail.com");
        forms.submmit();
        forms.printarTitulo();
        driver.quit();
    }
}
