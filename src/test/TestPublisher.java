package test;

import helloworld.Publisher;

public class TestPublisher implements Publisher {

	@Override
	public void publishText(String toPublish) {
		this.lastPublishedText = toPublish;
	}
	
	public String getLastPublishedText() {
		return lastPublishedText;
	}

	private String lastPublishedText;
}