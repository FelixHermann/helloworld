package learn.simplehelloworld;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class AppTest {
	
	private ConfigurationImpl testConfiguration;
	
	@Mock
	private Publisher mockPublisher;

	@Before
	public void initialize() {
		this.initializeMembers();
		this.testConfiguration.setPublisher(this.mockPublisher);
	}
	
	private void initializeMembers() {
		this.testConfiguration = new ConfigurationImpl();
		this.mockPublisher = mock(Publisher.class);
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
		verify(this.mockPublisher).publishText("Hello World!");
	}
}