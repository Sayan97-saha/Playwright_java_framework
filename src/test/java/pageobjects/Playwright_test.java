package pageobjects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.options.AriaRole;

public class Playwright_test {
	
	
	public static void main(String[] args) throws Throwable{
		try{
        	Map<String, String> env_map = new HashMap<String, String>();
    		env_map.put("PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD", "1");
//    		env_map.put("PWDEBUG", "1");
        	Playwright playwright = Playwright.create(new Playwright.CreateOptions().setEnv(env_map));
        	LaunchOptions launch_options = new LaunchOptions();
        	launch_options.setHeadless(false);
        	launch_options.setSlowMo(60);
        	launch_options.setChannel("chrome");
        	launch_options.setArgs(Arrays.asList("--start-maximized"));
        	Browser browser = playwright.chromium().launch(launch_options);
        	BrowserContext brwsr_cntxt = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        	Page page = brwsr_cntxt.newPage();
        	
        	page.navigate("https://www.google.com/search?q=https%3A%2F%2Fwww.flipkart.com&oq=https%3A%2F%2Fwww.flipkart.com&gs_lcrp=EgZjaHJvbWUyBggAEEUYOjIGCAEQRRg50gEJMzU2ODdqMGoyqAIAsAIA&sourceid=chrome&ie=UTF-8");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Online Shopping Site for Mobiles, Electronics, Furniture ... Flipkart https://")).click();
            page.getByPlaceholder("Search for Products, Brands").click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("mobiles").setExact(true)).click();
            page.navigate("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=8fbbe571-ef4f-444e-9dab-71b239865cb7&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D20000");
            page.navigate("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=8fbbe571-ef4f-444e-9dab-71b239865cb7&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D20000&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG");
            page.navigate("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=8fbbe571-ef4f-444e-9dab-71b239865cb7&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D20000&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG&p%5B%5D=facets.rating%255B%255D%3D4%25E2%2598%2585%2B%2526%2Babove");
            page.navigate("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=8fbbe571-ef4f-444e-9dab-71b239865cb7&p%5B%5D=facets.rating%255B%255D%3D4%25E2%2598%2585%2B%2526%2Babove&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D20000&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG&p%5B%5D=facets.ram%255B%255D%3D4%2BGB");
            page.navigate("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=8fbbe571-ef4f-444e-9dab-71b239865cb7&p%5B%5D=facets.rating%255B%255D%3D4%25E2%2598%2585%2B%2526%2Babove&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D20000&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG&p%5B%5D=facets.ram%255B%255D%3D4%2BGB&p%5B%5D=facets.discount_range_v1%255B%255D%3D50%2525%2Bor%2Bmore");
            page.navigate("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=8fbbe571-ef4f-444e-9dab-71b239865cb7&p%5B%5D=facets.rating%255B%255D%3D4%25E2%2598%2585%2B%2526%2Babove&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D20000&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG&p%5B%5D=facets.ram%255B%255D%3D4%2BGB");
             
            
//            page.navigate("http://playwright.dev");
//            System.out.println(page.title());
        }
		catch(Exception e){
			e.printStackTrace();
		}
    }

}
