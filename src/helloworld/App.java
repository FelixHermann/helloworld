package helloworld;

public class App {
	
	public App(Configuration configuration) {
		this.publisher = configuration.getPublisher();
	}
	
	public void publishHelloWorld() {
		this.publisher.publishText(HELLO_WORLD_MESSAGE);
	}
	
	private Publisher publisher;
	private final String HELLO_WORLD_MESSAGE = "Hello World!";
}