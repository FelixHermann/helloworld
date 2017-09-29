package helloworld;

import test.TestPublisher;

public class ConfigurationImpl implements Configuration {

	@Override
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	private Publisher publisher = new TestPublisher();
}