package learn.helloworld;

public class Starter {

	public static void main(String[] args) {
		new App(getConfiguration()).publishHelloWorld();
	}
	
	private static Configuration getConfiguration() {
		ConfigurationImpl config = new ConfigurationImpl();
		config.setPublisher(new Console());
		return config;
	}
}