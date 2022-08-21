package webdriver_arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("launch the firefox driver");
	}

	@Override
	public void get(String url) {
		System.out.println("launch url: " + url);
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on the : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering the element: " + value);
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}

}
