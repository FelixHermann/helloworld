package learn.helloworld;

public class ConfigurationImpl implements Configuration {
	
	private Publisher publisher;

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
}