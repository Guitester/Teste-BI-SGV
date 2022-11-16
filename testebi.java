package sgvbi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;



public class testebi {
	
	@Test
	public void ct1_efetuarlogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bivh.spezi.com.br");
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")));
		WebElement elemento = driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div"));
		Assert.assertEquals(true, elemento.isDisplayed());
		driver.close();
	}
	@Test
	 public void ct1_1logincomletras() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bivh.spezi.com.br/");
		driver.findElement(By.id("cpf")).sendKeys("a");
	}
	@Test
	public void ct1_2apagardados(){
//		apagar dados com função limpar
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bivh.spezi.com.br/");
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.cssSelector("i.mdi-close-circle.mdi.v-icon.notranslate.v-icon--size-default.v-theme--light.v-icon--clickable")).click();
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[3]/form/div/div[2]/div/div[2]/div/div/div/div[4]/i")).click();
		driver.close();
	}
	@Test
	public void ct1_3efetuarloginerrado() {
//		efetuar login com login errado
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bivh.spezi.com.br/");
		driver.findElement(By.id("cpf")).sendKeys("05352347223");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("1234789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/span[1]")));
		WebElement elemento = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
		Assert.assertEquals(true, elemento.isDisplayed());
		driver.close();
	}
	@Test
	public void ct2_fazerlogout() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suporte'])[1]/following::span[1]")));
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.close();
	}
	@Test
	public void ct2_1selecionarperfil(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meu perfil'])[1]/following::span[1]")));
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suporte'])[1]/following::span[1]")).click();
		driver.close();
	}
	@Test
	public void ct3_darkmode() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div/div[2]/button[2]/i")).click();
		driver.close();
	}
	@Test
	public void ct4_habilitadesabilita() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meu perfil'])[1]/following::span[1]")));
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suporte'])[1]/following::span[1]")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div[2]/div/div[3]/button")));
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[2]/button")).click();
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[3]/div/div[2]/div/div/div/div[3]/div/input")).click();
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[9]/div/div/button/span")).click();
		driver.close();
	}
	@Test
	public void ct4_1editarinformacao() {
//		verificar porque não está pegando o nome certo
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meu perfil'])[1]/following::span[1]")));
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suporte'])[1]/following::span[1]")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div[2]/div/div[3]/button")));
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[2]/button")).click();
		WebElement elemento =  driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[3]/div/div[2]/div/div/div/div[3]/div/input"));
		elemento.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),Keys.BACK_SPACE );
		elemento.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
		elemento.clear();
		elemento.sendKeys("ALDAIR REMUSSIA");
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[9]/div/div[2]/button")).click();
		driver.findElement(By.cssSelector(".img-logo > .v-img__img")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div[2]/div/div[3]/button")));
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[2]/button")).click();
		WebElement element =  driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[3]/div/div[2]/div/div/div/div[3]/div/input"));
		element.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),Keys.BACK_SPACE );
		element.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
		element.clear();
		element.sendKeys("ALDAIR REMUSSI");
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[9]/div/div[2]/button")).click();
		WebElement name = driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div[2]/div/div[2]/span"));
		Assert.assertEquals(true, name.isDisplayed());
		driver.close();
	}
	@Test
	public void ct4_2mudarsenha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meu perfil'])[1]/following::span[1]")));
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suporte'])[1]/following::span[1]")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div[2]/div/div[3]/button")));
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[2]/button")).click();
		driver.findElement(By.xpath("//div[7]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456");
		driver.findElement(By.xpath("//div[8]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[9]/div/div[2]/button")).click();
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suporte'])[1]/following::span[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/form[1]/div[1]")));
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap header.v-toolbar.v-toolbar--density-default.bg-white.v-theme--light.v-app-bar div.v-toolbar__content div.v-row.align-center > div.v-col-md-8.v-col-lg-6.v-col-9.d-flex.justify-end.align-center.pr-0")));
		driver.findElement(By.cssSelector("i.mdi-chevron-down.mdi.v-icon.notranslate.v-icon--size-default.text-black.v-theme--light")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meu perfil'])[1]/following::span[1]")));
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suporte'])[1]/following::span[1]")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[2]/div/div[2]/div/div[3]/button")));
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[2]/button")).click();
		driver.findElement(By.xpath("//div[7]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//div[8]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/form/div/div[9]/div/div[2]/button")).click();
		driver.close();
	}
	@Test
	public void ct6_1faturamentoporfilial() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap main.v-main div.v-main__wrap div.v-container.v-container--fluid.pl-13.pr-13 div.v-row.mt-5 > div.v-col.v-col-12:nth-child(3)")));	
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dark Mode On'])[1]/following::div[8]")).click();
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[3]/div/div[4]/div/div[3]/button")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")));
		WebElement elemento = driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)"));		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", elemento);
		driver.close();
	}
	
	@Test
	public void ct7_1faturamentoporperiodo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap main.v-main div.v-main__wrap div.v-container.v-container--fluid.pl-13.pr-13 div.v-row.mt-5 > div.v-col.v-col-12:nth-child(3)")));	
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[7]/div/div[2]/button/i")).click();
		driver.findElement(By.cssSelector("div.v-list-item-title")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".v-col-sm-6:nth-child(1) .v-field__input")));
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div")).click();
		driver.findElement(By.cssSelector(".v-list-item:nth-child(1) .v-list-item-title")).click();
		driver.findElement(By.cssSelector(".v-col-sm-6 > .v-btn--elevated")).click();
		driver.close();
	}
	@Test
	  public void ct7_2() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://bivh.spezi.com.br/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("cpf")).sendKeys("464.215.130-34");
	    driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).click();
	    driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
	    driver.findElement(By.cssSelector(".text-white")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap main.v-main div.v-main__wrap div.v-container.v-container--fluid.pl-13.pr-13 div.v-row.mt-5 > div.v-col.v-col-12:nth-child(3)")));	
	    driver.findElement(By.cssSelector(".v-col-sm-12 > .v-card .mdi-dots-vertical")).click();
	    driver.findElement(By.cssSelector(".v-list-item-title")).click();
	    pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".v-col-sm-12 .v-field__field")));
	    WebElement element = driver.findElement(By.cssSelector(".v-col-sm-12 .v-field__field"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	    driver.findElement(By.xpath("//div[2]/div/div/div/div[3]")).click();
	    driver.findElement(By.cssSelector(".v-list-item:nth-child(1) .v-list-item-title")).click();
	    driver.findElement(By.cssSelector(".v-col-sm-6 > .v-btn--elevated")).click();
	    driver.close();
	  }
	
	@Test
	public void ct7_3faturamentoporgrupoproduto() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://bivh.spezi.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cpf")).sendKeys("46421513034");
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@id='login']/span")).click();
		WebDriverWait pause = new WebDriverWait(driver,20);
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.v-application.v-theme--light.v-layout.v-layout--full-height.v-locale--is-ltr div.v-application__wrap main.v-main div.v-main__wrap div.v-container.v-container--fluid.pl-13.pr-13 div.v-row.mt-5 > div.v-col.v-col-12:nth-child(3)")));	
		driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div/div/div[5]/div/div[2]/div/div[2]/button/i")).click();
		pause.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='v-list-item-title']")));
		driver.findElement(By.xpath("//div[@class='v-list-item-title']")).click();
		pause.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".v-col-sm-6:nth-child(1) .v-field__input")));
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div[3]/div")).click();
		driver.findElement(By.cssSelector(".v-list-item:nth-child(1) .v-list-item-title")).click();
		driver.findElement(By.cssSelector(".v-col-sm-6 > .v-btn--elevated")).click();
		driver.close();
	}
	
	
	/*@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('testando alerta via javascript')");
	}*/
}
