package junitwebapp;

import org.junit.Test;
import org.junit.Before;

public class JWebUnitTest {
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8081/junitwebapp");
    }
 
    private void setTestingEngineKey(String testingEngineHtmlunit) {
		// TODO Auto-generated method stub
		
	}

	private void setBaseUrl(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testLoginPage() {
        beginAt("index.jsp"); 
        assertTitleEquals("Login");
        assertLinkPresent("home");
        clickLink("home");
        assertTitleEquals("Home");
    }
     
    @Test
    public void testHomePage() {
        beginAt("home.jsp"); 
        assertTitleEquals("Home");
        assertLinkPresent("login");
        clickLink("login");
        assertTitleEquals("Login");
    }

	private void beginAt(String string) {
		// TODO Auto-generated method stub
		
	}

	private void assertLinkPresent(String string) {
		// TODO Auto-generated method stub
		
	}

	private void clickLink(String string) {
		// TODO Auto-generated method stub
		
	}

	private void assertTitleEquals(String string) {
		// TODO Auto-generated method stub
		
	}
}