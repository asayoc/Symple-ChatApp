package com.udacity.jwdnd.c1.review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ReviewApplicationTests {

	@LocalServerPort
	private Integer port;

	private static WebDriver driver;
	//private static WebDriverWait wait;
	private SignupPage signup;

	@BeforeAll
	public static void beforeAll() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//wait = new WebDriverWait(driver, 10);
	}

	@AfterAll
	public static void afterAll() {
		driver.quit();
	}

	@BeforeEach
	public void beforeEach() {
		driver.get("http://localhost:" + port + "/signup");
		signup = new SignupPage(driver);
	}

	@Test
	public void testSuccessRegistration() throws InterruptedException {

		signup.setFirstName("Arisa");
		signup.setLastName("Ross");
		signup.setUserName("aross01");
		signup.setPassword("1234");

		Thread.sleep(2000); // view friendly

		signup.submitForm();

		String success = signup.getMessage("SUCCESS");
        assertTrue(success.contains("You successfully signed up!"));

		Thread.sleep(3000); // view friendly
	}

}
