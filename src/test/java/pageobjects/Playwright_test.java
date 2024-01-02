package pageobjects;

import java.awt.Rectangle;
import java.util.Arrays;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Playwright_test {
	
	
	public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
        	LaunchOptions launch_options = new LaunchOptions();
        	launch_options.setHeadless(false);
        	launch_options.setSlowMo(60);
        	launch_options.setArgs(Arrays.asList("--start-maximized"));
            
//        	Rectangle screenSize = browser().getWindowSize();
//        	context.browser().setViewportSize(new Viewport(screenSize.getWidth(), screenSize.getHeight()));
        	
        	
        	Browser browser = playwright.chromium().launch(launch_options);
        	BrowserContext brwsr_cntxt = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        	Page page = brwsr_cntxt.newPage();
            
            
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
        }
    }

}
