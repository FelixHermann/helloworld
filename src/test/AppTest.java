package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import helloworld.App;
import helloworld.ConfigurationImpl;

public class AppTest {

	@Before
	public void initialize() {
		this.initializeMembers();
		this.testConfiguration.setPublisher(this.testPublisher);
	}
	
	private void initializeMembers() {
		this.testConfiguration = new ConfigurationImpl();
		this.testPublisher = new TestPublisher();
	}
	
	@Test
	public void test() {
		this.runApp();
		this.testAssertion();
	}

	private void runApp() {
		new App(this.testConfiguration).publishHelloWorld();
	}
	
	private void testAssertion() {
		assertEquals("Hello World!", this.testPublisher.getLastPublishedText());
	}
	
	private ConfigurationImpl testConfiguration;
	private TestPublisher testPublisher;
}