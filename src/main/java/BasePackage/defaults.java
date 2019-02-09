package BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class defaults {

	static String path_file = "/data.properties";

	public static WebDriver setDefaults() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static String loadData(String Key) throws Exception {

		File f = new File(path_file);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(Key);

	}
}
