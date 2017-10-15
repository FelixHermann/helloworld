package learn.helloworld;

public class App {
	
	private Publisher publisher;
	private final String HELLO_WORLD_MESSAGE = "Hello World!";
	
	public App(Configuration configuration) {
		this.publisher = configuration.getPublisher();
	}
	
	public void publishHelloWorld() {
		this.publisher.publishText(HELLO_WORLD_MESSAGE);
	}
}