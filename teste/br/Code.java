package br;


//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class Code {
	
//	private WebDriver driver;
//	private String baseUrl;
//	private StringBuffer verificationErrors = new StringBuffer();
//	
//	@Before
//	public void setUp() throws Exception {
//		driver = new FirefoxDriver();
//		baseUrl = "http://localhost:8080/jsfapp/principal.xhtml";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@Test
//	public void testCode() throws Exception {
//		driver.get(baseUrl + "/jsfapp/index.xhtml");
//		driver.findElement(By.id("frm:btnSalva")).click();
//		driver.findElement(By.id("frm:nome")).clear();
//		driver.findElement(By.id("frm:nome")).sendKeys("giseldo");
//		driver.findElement(By.id("frm:cpf")).clear();
//		driver.findElement(By.id("frm:cpf")).sendKeys("00061675512");
//		driver.findElement(By.id("frm:data")).clear();
//		driver.findElement(By.id("frm:data")).sendKeys("25/08/1980");
//		driver.findElement(By.id("frm:celular")).clear();
//		driver.findElement(By.id("frm:celular")).sendKeys("91915015");
//		driver.findElement(By.id("frm:email")).clear();
//		driver.findElement(By.id("frm:email")).sendKeys("giseldo@gmail.com");
//		driver.findElement(By.id("frm:login")).clear();
//		driver.findElement(By.id("frm:login")).sendKeys("giseldo");
//		driver.findElement(By.id("frm:senha")).clear();
//		driver.findElement(By.id("frm:senha")).sendKeys("123456");
//		driver.findElement(By.id("frm:confirmasenha")).clear();
//		driver.findElement(By.id("frm:confirmasenha")).sendKeys("123456");
//		driver.findElement(By.id("frm:btnSalva")).click();
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//		String verificationErrorString = verificationErrors.toString();
//		if (!"".equals(verificationErrorString)) {
//			fail(verificationErrorString);
//		}
//	}
//
//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
}
